package com.conversor.divisas.operaciones;

import com.conversor.divisas.modelos.Conversor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.FieldNamingPolicy;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Peticiones {

    private String llave="f0e8b3dc38d161a351f29c2e";
    private Gson interprete= new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .create();


    public double conversion(String monedaEntrada, String monedaSalida, double cantidad) throws IOException, InterruptedException {
        double cambio = 0;
        String direccion="https://v6.exchangerate-api.com/v6/"+this.llave+"/pair/"+monedaEntrada+"/"+monedaSalida+"/"+cantidad;
        try  {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccion)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            Conversor solucion = interprete.fromJson(json, Conversor.class);
            cambio = solucion.getCantidadResultado();
        }
        catch (NumberFormatException e){
            System.out.println("Error al convertir el formato de variable: ");
            System.out.println(e.getMessage());
        }catch(IllegalArgumentException e){
            System.out.println("Error en la direccion de conexion.");
        }

        return cambio;
    }
}
