/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_10_05_2018;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Edades {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner entrada = new Scanner (System.in);
         int suma = 0;
         int edad = 0;
         int contador = 1;
        String cadena_final = String.format("%s\t%s\n","Edad","Suma");
         
         while (contador <=5) {
             System.out.printf("Ingrese el valor de edad");
             edad= entrada.nextInt();
             suma = suma + edad;
             cadena_final = String.format("%s%d\t%d\n", cadena_final, edad, suma);
             contador = contador + 1;
         }
         System.out.printf("%s", cadena_final);
    }
    
    
}
