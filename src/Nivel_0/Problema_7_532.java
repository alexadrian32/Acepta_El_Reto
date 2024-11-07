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
public class Problema_7_532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,s; //n1 = numero 1, n2 = numero 2, s = solucion
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            n1 = sc.nextInt();
            n2 =sc.nextInt();
            s =n2-n1;
            System.out.println(s);
        }
        
    }
}
