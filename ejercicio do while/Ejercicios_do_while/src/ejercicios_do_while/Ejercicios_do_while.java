/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_do_while;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicios_do_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String reporte_final;
        String nom_jugador="";
        String apellido="";
        int num_partidos = 0;
        int sum = 0;
        int promedio = 0;
        int cant_jugadores = 0;
        int contador = 0;
        int promedio_pases = 0;
        int promedio_goles = 0;
        int suma_pases = 0;
        int suma_goles = 0;
        reporte_final = String.format("%s\n", "Reporte de jugadores del equipo UTPL");
        System.out.printf("%s", "Ingrese el numero de jugadores que desea ingresar:\n");
        cant_jugadores = entrada.nextInt();
        int cont;

        do {
            suma_goles = 0;
            suma_pases = 0;
            for (cont = 1; cont <= cant_jugadores; cont++) {
                System.out.println("¿Ingrese el nombre del jugador?");
                nom_jugador = entrada.next();
                System.out.println("¿Ingrese el apellido del jugador?");
                apellido = entrada.next();
                System.out.println("¿Ingrese el numero de partidos jugados:?");
                num_partidos = entrada.nextInt();
                reporte_final = String.format("%s%s\t\t\t%s\t\t\t%s\t\t%s\n", reporte_final, "Nombre del jugador ", "Total pases", "Total goles", "Nivel jugador");
                reporte_final = String.format("%s%s\t%s", reporte_final, nom_jugador, apellido);
                entrada.nextLine();
                int num_pases = 0;
                int num_goles = 0;
                int total_pases = 0;
                int total_goles = 0;
                for (int cont_2 = 1; cont_2 <= num_partidos; cont_2++) {
                    System.out.printf("\n%s\n", "DATOS DEL JUGADOR\n");
                    System.out.printf("%s%d", "P:", cont_2);
                    System.out.println("¿Ingrese el total de pases realizados en el partido");
                    num_pases = entrada.nextInt();
                    System.out.printf("%s%d", "P:", cont_2);
                    System.out.println("¿Ingrese el total de goles realizados en el partido");
                    num_goles = entrada.nextInt();
                    entrada.nextLine();
                    total_pases = total_pases + num_pases;
                    total_goles = total_goles + num_goles;

                    reporte_final = String.format("%s\t\t\t\t\t%s%d%s%d\t\t\t\t%s%d%s%d\n", reporte_final, "P", cont_2, ":", num_pases, "P", cont_2, ":", num_goles);

                }
                suma_pases = suma_pases + total_pases;
                suma_goles = suma_goles + total_goles;

                reporte_final = String.format("\n\t%s\t\t\t\t\t%s%d\t\t\t%s%d", reporte_final, "Total: ", total_pases, "Total: ", total_goles);

                if (total_pases == 100) {
                    reporte_final = String.format("%s\t\t%s\n", reporte_final,"Exelente");
                    System.out.println("Exelente");
                } else {
                    if (total_pases >= 80 && num_pases <=99) {
                        reporte_final = String.format("%s\t\t%s\n", reporte_final, "Muy bueno");
                        System.out.println("Muy bueno");
                    } else {
                        if (total_pases>= 60 && num_pases <= 79) {
                            reporte_final = String.format("%s\t\t%s\n", reporte_final, "Bueno");
                            System.out.println("Bueno"); 
                        } else {
                            if (total_pases >= 0 && num_pases <= 59) {
                                reporte_final = String.format("%s\t\t%s\n", reporte_final, "Regular");
                               
                            }
                        }
                    }

                }

            }
        } while (cont <= cant_jugadores);

        System.out.println(reporte_final);
        System.out.printf("El promedio de pases es : %d\n", promedio_pases = suma_pases / cant_jugadores);
        System.out.printf("El promedio de goles es: %d\n", promedio_goles = suma_goles / cant_jugadores);

    }
}
    