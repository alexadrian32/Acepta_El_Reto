package Nivel_0;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tarde
 */
public class Problema_10_621 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),n1;
        for (int i = 0; i < n; i++) {
            n1=sc.nextInt();
            if (n1%2==0) {
                n1+=1;
            }else {
            n1-=1;
            }
            System.out.println(n1);
        }
    }
}
