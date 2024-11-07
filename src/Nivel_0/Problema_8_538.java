/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nivel_0;

import java.util.Scanner;

/**
 *
 * @author tarde
 */
public class Problema_8_538 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        do {
            n1 = sc.nextInt();
            n2 = sc.nextInt();            
                if (!(n1 == 0 && n2 == 0)) {
                    if (n1 < n2) {
                        System.out.println("SENIL");
                    } else {
                        System.out.println("CUERDO");
                    }
               }
        } while (!(n1 == 0 && n2 == 0));

    }
}
