package com.programacion;

public class Singleton {

    private int edad;
    private String nombre;
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
