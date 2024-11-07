package Nivel_0;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Dicen los viejos que en este país el latín era una asignatura obligatoria por la que todos los estudiantes de bachillerato tenían que pasar.
Dicen los viejos que el primer día de clase de latín cualquiera esperaba que los alumnos salieran sabiendo el "rosa rosae".
Dicen los viejos que esa era la primera declinación.
Quizá, dentro de muchos años, nosotros seamos los viejos que contemos batallitas de cómo se enseñaba informática. Y quizá entonces, digamos que en la primera clase de cualquier curso en el que se explicara un lenguaje de programación, se tenía que salir habiendo escrito "un hola mundo".
Y eso es lo que vamos a hacer. Escribir un programa que escriba tantos "hola mundo" como nos pidan.
Entrada
La entrada consta de una única línea que contiene un número n, 0 ≤ n ≤ 5, que indica cuántos mensajes hay que emitir.
Salida
Cada mensaje a escribir aparecerá en una única línea y será la cadena "Hola mundo.".
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tarde
 */
import java.util.Scanner;
public class Problema_1_116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        for (int i= 0 ; i<n ;i ++){
            System.out.println("Hola mundo.");
        }
    }
}
