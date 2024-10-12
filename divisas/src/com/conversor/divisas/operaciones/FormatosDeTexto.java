package com.conversor.divisas.operaciones;

public class FormatosDeTexto {

    public String colorDeTexto(String texto, String color)
    {
        String textoConColor="";
        switch (color)
        {
            case "ROJO":textoConColor="\u001B[31m"+texto;
            break;
            case "AMARILLO":textoConColor="\u001B[33m"+texto;
            break;
            case "AZUL":textoConColor="\u001B[34m"+texto;
            break;
            default:textoConColor="\u001B[0m"+texto;
            break;
        }
        textoConColor=textoConColor+"\u001B[0m";
        return textoConColor;
    }
}
