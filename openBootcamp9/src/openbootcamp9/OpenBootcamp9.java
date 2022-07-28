/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openbootcamp9;

/**
 *
 * @author arturo
 */
public class OpenBootcamp9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cliente cliente = new Cliente();
       Trabajador trabajador = new Trabajador();
       cliente.nombre = "Raul";
       cliente.edad = 23;
       cliente.telefono = 23232324;
       cliente.credito = 150.55;
       System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años y mi telefono es " + cliente.telefono
                + " y mi credito disponible es " + cliente.credito + "€");
        
        trabajador.nombre = "Jose";
        trabajador.edad = 42;
        trabajador.telefono = 3243245;
        trabajador.salario = 2230.23;
      System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi telefono es " + trabajador.telefono
                + " y mi salario es de " + trabajador.salario + "€");
       
    }
    
}

class Persona{
    int edad;
    int telefono;
    String nombre;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona{
    double salario;
    String credito;
}