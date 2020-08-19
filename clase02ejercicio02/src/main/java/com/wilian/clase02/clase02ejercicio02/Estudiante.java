package com.wilian.clase02.clase02ejercicio02;

public class Estudiante extends Persona {

    private int Matricula;    // Abstrayendo atributos del objeto Estudiante
    private String Carrera;

    /*A traves del constructor se solicitara el ingreso de los datos 
    necesarios para los atributos de la clase*/
    public Estudiante(String Nombre, String Direccion, String FechaNC,
            String Genero, int Edad, int Matricula, String Carrera) {

        this.Nombre = Nombre;        //Asignando los datos
        this.Direccion = Direccion;  //obtenidos, a los respectivos
        this.FechaNC = FechaNC;      //atributos de la clase Estudiante;
        this.Genero = Genero;        //propios de la clase y heredados
        this.Edad = Edad;            //de la clase padre
        this.Matricula = Matricula;
        this.Carrera = Carrera;
    }

    /*Sera llamado para mostrar los datos que se almacenan en los atributos 
    propios y heredados de la clase Estudiante; el nombre del atributo y el dato
    contenido*/
    @Override
    public String toString() {
        return "Estudiante{" + "Nombre=" + Nombre + ", Direccion="
                + Direccion + ", FechaNC=" + FechaNC + ", Genero=" + Genero
                + ", Edad=" + Edad + "Matricula=" + Matricula + ", Carrera="
                + Carrera + '}';
    }

}
