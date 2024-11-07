/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nivel_1;

import java.util.Scanner;

/**
 *
 * @author tarde
 */
public class Problema_1_112 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m, vmax, km, v, vpuntos, aux, tiempoHoras,
                tiempoMedio;
        do {
            m = sc.nextInt();
            vmax = sc.nextInt();
            km = sc.nextInt();
            if (!(m == 0 && vmax == 0 && km == 0)) {
                aux = m / 1000;
                tiempoHoras = km / 3600;
                tiempoMedio = aux / tiempoHoras;
                if (m <= 0 || vmax <= 0 || km <= 0) {
                    System.out.println("ERROR");
                } else if (tiempoMedio < vmax) {
                    System.out.println("OK");
                } else if ((tiempoMedio - vmax) < (0.2 * vmax)) {
                    System.out.println("MULTA");
                } else if ((tiempoMedio - vmax) > (0.2 * vmax)) {
                    System.out.println("PUNTOS");
                }

            }
        } while (!(m == 0 && vmax == 0 && km == 0));
    }
}