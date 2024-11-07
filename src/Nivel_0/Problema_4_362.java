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
public class Problema_4_362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt( sc.nextLine());
        for (int i = 0;n>i;i++){
            int DD= sc.nextInt();
            int MM =  sc.nextInt();
            if (DD == 25 && MM == 12){
                System.out.println("SI");
            }else {
                System.out.println("NO");
            }
      
        }
    }
}
