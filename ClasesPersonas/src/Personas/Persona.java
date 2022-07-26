/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

/**
 *
 * @author arturo
 */
public class Persona {
    String edad;
    String nombre;
    String telefono;

    public Persona(String edad_a, String nombre_a, String telefono_a) {
        edad = edad_a;
        nombre = nombre_a;
        telefono = telefono_a;
    }
    public void DespliegaInfo(){
        System.out.println("\n Edad: " + edad + "\n Nombre: " + nombre + "\n Telefono: "+ telefono);
    }
    
    
}
