/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solowhile;

/**
 *
 * @author arturo
 */
public class SoloWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int contador = 10;
       
        while (contador > 1) {            
            System.out.println(contador);
            contador = contador - 1;
        }
    }
    
}
