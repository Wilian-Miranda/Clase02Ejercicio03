package com.wilian.clase02.clase02ejercicio02;

public class Profesor extends Persona {

    // Abstrayendo atributos del objeto Profesor
    private String Titulo, Dedicacion;

    /*A traves del constructor se solicitara el ingreso de los datos 
    necesarios para los atributos de la clase*/
    public Profesor(String Nombre, String Direccion, String FechaNC, String Genero, int Edad,
            String Titulo, String Dedicacion) {

        this.Nombre = Nombre;        //Asignando los datos
        this.Direccion = Direccion;  //obtenidos, a los respectivos
        this.FechaNC = FechaNC;      //atributos de la clase Profesor;
        this.Genero = Genero;        //propios de la clase y heredados 
        this.Edad = Edad;            //de la clase padre
        this.Titulo = Titulo;
        this.Dedicacion = Dedicacion;
    }

    /*Sera llamado para mostrar los datos que se almacenan en los atributos 
    propios y heredados de la clase Profesor; el nombre del atributo y el dato
    contenido*/
    @Override
    public String toString() {
        return "Profesor{" + "Nombre=" + Nombre + ", Direccion="
                + Direccion + ", FechaNC=" + FechaNC + ", Genero=" + Genero
                + ", Edad=" + Edad + ", Titulo=" + Titulo + ", Dedicacion="
                + Dedicacion + '}';
    }

}
