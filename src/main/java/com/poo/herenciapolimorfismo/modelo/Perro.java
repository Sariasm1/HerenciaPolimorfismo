/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author taidy
 */
public class Perro extends Animal {
    private int edad;
    private String raza;
    private static final String razaDefault = "Chandi";
    private static final int edadDefault = 0;
    
     public Perro() {
        super("Pongo");
        this.edad = edadDefault;
        this.raza = razaDefault;
    }
    
    public Perro(String nombre){
        super(nombre);
        this.edad = edadDefault;
        this.raza = razaDefault;
    }

    public Perro(String nombre, int edad, String raza) {
        super(nombre);
        this.edad = edad;
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    @Override
    public void hacerSonido() {
      System.out.println(getNombre()+ " hace GUAU GUAU!");
    }
}

