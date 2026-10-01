/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author Estudiante
 */
public class PerroGrande extends Perro {
    private int pesoKg;

    public PerroGrande(int pesoKg) {
        super();
        this.pesoKg = pesoKg;
    }

    public PerroGrande(int pesoKg, String nombre) {
        super(nombre);
        this.pesoKg = pesoKg;
    }

    public PerroGrande(int pesoKg, String nombre, int edad, String raza) {
        super(nombre, edad, raza);
        this.pesoKg = pesoKg;
    }

    public int getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(int pesoKg) {
        this.pesoKg = pesoKg;
    }
    
    
    
    
    
}
