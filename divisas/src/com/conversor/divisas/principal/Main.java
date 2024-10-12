package com.conversor.divisas.principal;


import com.conversor.divisas.operaciones.Menu;

import java.awt.*;
import java.util.Scanner;

public class Main {

    static Menu menu=new Menu();
    static Scanner opcion= new Scanner(System.in);

    private static void iniciar()
    {
        String n="-1";
        while(!n.equals("9"))
        {
            switch(n)
            {
                case "1":menu.convertir("USD","ARS");
                break;
                case "2":menu.convertir("ARS","USD");
                break;
                case "3":menu.convertir("USD","BRL");
                break;
                case "4":menu.convertir("BRL","USD");
                break;
                case "5":menu.convertir("USD","COP");
                break;
                case "6":menu.convertir("COP","USD");
                break;
                case "7":menu.convertir("USD","MXN");
                break;
                case "8":menu.convertir("MXN","USD");
                break;
                case "-1":;
                break;
                default:menu.invalidar();
                break;
            }

            menu.menuPrincipal();
            n=opcion.nextLine();
        }
        menu.salir();
    }
    public static void main(String[] args) {
        iniciar();
    }
}