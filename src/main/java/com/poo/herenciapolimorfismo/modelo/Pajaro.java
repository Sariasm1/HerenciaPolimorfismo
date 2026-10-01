/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author Estudiante
 */
public class Pajaro extends Animal {

    public static int altura=0;
    
    public Pajaro(String nombre) {
        super(nombre);
    }
   
    public Pajaro() {
        super("Antonio");
    }
 
    
    public void volar(){
         altura+=10;
        System.out.println("El pajaro "+ getNombre() + " esta volando a una altura de " + altura + "m");
    }
    
    
    @Override
    public void hacerSonido() {
      System.out.println(getNombre()+ " hace bru bru!");
    }
    
}
