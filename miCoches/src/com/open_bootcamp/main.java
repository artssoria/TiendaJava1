/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.open_bootcamp;


public class main {
    public static void main(String[] args) {
       Coche miCoche = new Coche();
       miCoche.aumentarPuertas();
        System.out.println("El coche ahora tiene " + miCoche.puertas + " puertas");
        
        
    }
    
}
class Coche{
    public int puertas = 4;
    public void aumentarPuertas(){
        this.puertas++;
    }
    public void quitarPuertas(){
    this.puertas--;
}
}