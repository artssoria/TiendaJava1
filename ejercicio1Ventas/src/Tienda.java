
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arturo
 */
public class Tienda {
    public static void main(String[] args) {
      double ventas[] = new double[10];
      Scanner sc = new Scanner(System.in);
        System.out.println("ingrese las 10 ventas del mes: ");
                for(int i = 0; i < ventas.length;i++){
                    System.out.println("Venta "+(i+1));
                    ventas[i]=sc.nextDouble();
                }
                int k=0;
                int total=0;
                System.out.println("Ventas mayores o igual a $2000");
                while(k<10){
                    if(ventas[k] >= 2000){
                        System.out.println("$"+ventas[k]);
                    total++;
                    
                    }
                     k++;
                   
                }
                 System.out.println("El total de ventas mayores a 200 es: "+ total);
    }
   
}
