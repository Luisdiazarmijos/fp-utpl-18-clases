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
public class estaturas {
     public static void main(String[] args) {
        // TODO code application logic here

       Scanner teclado = new Scanner(System.in);
        double estatura = 0;
        double promedio;
        double suma = 0;
      double[]  jugador = null ;
        int opcion;
         int cont=0;
        boolean bandera =true;
        while(bandera){
            System.out.println("Ingrese la estatura del jugador: ");
            estatura=teclado.nextDouble();
//            if (estatura<120) {
//                estatura=120;
//                
//            }
//            jugador[cont]=estatura;
            suma=suma+estatura;
            cont = cont+1;
            System.out.println("Desea ingresar mas jugadores"
                    + "[1] si"
                    + "[2] no");
            opcion=teclado.nextInt();
            if (opcion==1) {
                bandera=true;   
            }else if(opcion!=1){
                bandera=false;
                promedio=suma/cont;
        System.out.printf("Reporte de estaturas\n"+"Edad de estudiantes \n"+estatura+"\n"+"Promedio de estatura:"+promedio);
            }  
        
        }
     }
}
