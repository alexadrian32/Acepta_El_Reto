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
public class Problema_12_682 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),n1,aux;
        for (int i = 0; i < n; i++) {
            n1=sc.nextInt();
            aux=n1;
            n1 =n1*2;
            System.out.println(aux+" "+n1);
        }
    }
}
