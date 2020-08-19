package com.wilian.clase02.clase02ejercicio02;

public class ClaseMain {

    public static void main(String[] args) {

        /*creando una instancia de la clase Profesor e introduciendo los datos 
        que seran almacenados en los atributos atraves del constructor*/
        Profesor Docente = new Profesor("Wilian", "Aguilares", "18/12/1998",
                "Masculino", 35, "Ingeniero", "Programador");
        
        /*mostrando los datos de los atributos; propios y heredados, del objeto
        Docente*/
        System.out.println(Docente.toString());
        System.out.println("");

        /*creando una instancia de la clase Estudiante e introduciendo los datos 
        que seran almacenados en los atributos, atraves del constructor*/
        Estudiante Est = new Estudiante("Wilian", "Chalatenango", "28/04/1998",
                "Masculino", 21, 150, "Ing. en Sistemas y Computación");
        
        /*mostrando los datos de los atributos, propios y heredados, del objeto
        Est*/
        System.out.println(Est.toString());
    }

}
