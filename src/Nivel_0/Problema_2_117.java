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
public class Problema_2_117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int n =Integer.parseInt( sc.nextLine());
        for (int i = 1 ; i <= n ;i++){
            nombre = sc.nextLine();
            System.out.println(nombre.replace("Soy", "Hola,")+".");
        }
    }
 
}
