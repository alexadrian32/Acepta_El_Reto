
package Nivel_0;

import java.util.Scanner;

public class Problema_6_427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasos = Integer.parseInt(sc.nextLine()); 

        for (int i = 0; i < numCasos; i++) {
            String nombre = sc.nextLine();
            String parentesco = sc.nextLine(); 

            if (nombre.equals("Luke") && parentesco.equals("padre")) {
                System.out.println("TOP SECRET");
            } else {
                System.out.println(nombre + ", yo soy tu " + parentesco);
            }
        }
    }
}
