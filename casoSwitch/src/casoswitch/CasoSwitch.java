/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casoswitch;

/**
 *
 * @author arturo
 */
public class CasoSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String estacion = "Primavera";
        
        
        switch(estacion){
            case "Verano":
                System.out.println("hace calor");
                break;
            case "Inverno":
                System.out.println("hace frio");
                break;
            case "Otoño":
                System.out.println("de remerita apenas");
                break;
            case "Primavera":
                System.out.println("vamos con los alergicos");
                break;
                
            default:
                System.out.println("no, ahora hablemos de clima");
                
        }
    }
    
}
