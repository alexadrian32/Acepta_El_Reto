/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nivel_0;

/**
 *
 * @author tarde
 */
import java.util.Scanner;

public class Problema_3_217 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n ;
        do {
            n = Integer.parseInt(sc.nextLine());
            if (n != 0) {
                int num = n % 2;
                if (num == 0) {
                    System.out.println("DERECHA");
                } else {
                    System.out.println("IZQUIERDA");

                }
            }
        } while (n != 0);

    }
}
