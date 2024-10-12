package com.conversor.divisas.operaciones;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Scanner opcion = new Scanner(System.in);
    FormatosDeTexto coloreador=new FormatosDeTexto();
    private String separador="------------------------------";
    private Peticiones peticion=new Peticiones();

    public void menuPrincipal()
    {
        System.out.println(coloreador.colorDeTexto(separador,"ROJO"));
        System.out.println(coloreador.colorDeTexto("Bienvenido al conversor de divisas","AMARILLO"));
        System.out.println(coloreador.colorDeTexto("1) Dolar => Peso Argentino","AMARILLO"));
        System.out.println(coloreador.colorDeTexto("2) Peso Argentino => Dolar","AMARILLO"));
        System.out.println(coloreador.colorDeTexto("3) Dolar => Real Brasileño","AMARILLO"));
        System.out.println(coloreador.colorDeTexto("4) Real Brasileño => Dolar","AMARILLO"));
        System.out.println(coloreador.colorDeTexto("5) Dolar => Peso Colombiano","AMARILLO"));
        System.out.println(coloreador.colorDeTexto("6) Peso Colombiano => Dolar","AMARILLO"));
        System.out.println(coloreador.colorDeTexto("7) Dolar => Peso Mexicano","AMARILLO"));
        System.out.println(coloreador.colorDeTexto("8) Peso Mexicano => Dolar","AMARILLO"));
        System.out.println(coloreador.colorDeTexto("9) Salir","AMARILLO"));
        System.out.println(coloreador.colorDeTexto("Elija una opción válida:","AMARILLO"));
        System.out.println(coloreador.colorDeTexto(separador,"ROJO"));
    }

    public void salir()
    {
        System.out.println(coloreador.colorDeTexto("Vuelva pronto.","AZUL"));
    }

    public void invalidar()
    {
        System.out.println(coloreador.colorDeTexto("Esta opcion es invalida, por favor vuelva a intentarlo.","ROJO"));
    }

    public void convertir(String monedaEntrada, String monedaSalida)
    {
        System.out.println(coloreador.colorDeTexto("Introduzca la cantidad que desea convertir:","AZUL"));
        try {
            double cantidad=1;
            cantidad = opcion.nextDouble();
            System.out.println(coloreador.colorDeTexto("El resultado es:" + peticion.conversion(monedaEntrada, monedaSalida, cantidad), "AMARILLO"));
        } catch (InputMismatchException e) {
            System.out.println(coloreador.colorDeTexto("Error al ingresar la cantidad a convertir. Vuelva a seleccionar una opcion.","ROJO"));
        }
        catch (IOException e)
        {
            System.out.println(coloreador.colorDeTexto("No se pudo realizar la peticion debido a problemas de conexion, revise y vuelva a intentarlo.","ROJO"));
        }
        catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
