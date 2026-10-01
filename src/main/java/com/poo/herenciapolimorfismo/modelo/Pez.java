/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author Estudiante
 */
public class Pez extends Animal {
    public static int profundidad=0;
    
    public Pez(String nombre) {
        super(nombre);
    }
    
    public Pez() {
        super("Golden");
    }
 
    public void nadar(){
        profundidad+=10;
        System.out.println("El pez "+ getNombre() + " esta nadando a una profunidad de " + profundidad + "m");
    }
    
    @Override
    public void hacerSonido() {
      System.out.println(getNombre()+ " hace glu glu!");
    }
}
