package com.programacion;

public class Main {

    public static void main(String[] args) {
        Singleton miInstancia = Singleton.getInstance();
        miInstancia.setEdad(20);
        miInstancia.setNombre("Juancarlos");

        Singleton Instancia2 = Singleton.getInstance();
        Instancia2.setEdad(30);
    }
}
