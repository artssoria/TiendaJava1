/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclofor;

/**
 *
 * @author arturo
 */
public class CicloFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     for(int contador = 1; contador <= 10; contador = contador +1){
         System.out.println(contador);
     }
     
     int contador = 1;
        while (contador <= 10) {            
            System.out.println(contador);
            contador = contador + 1;
        }
    }
    
}
