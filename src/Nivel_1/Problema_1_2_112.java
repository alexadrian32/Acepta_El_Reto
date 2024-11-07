package Nivel_1;



import java.util.Scanner;

/**
 *
 * @author tarde
 */
public class Problema_1_2_112{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  m, vmax, km, v, vpuntos;
        do {
            m = sc.nextInt();
            vmax = sc.nextInt();
            km = sc.nextInt();
            if (!(m == 0 && vmax == 0 && km == 0)) {
                v = (m / 1000) / (km / 3600);
              //  v = (m/1000)/(km/3600);
             //  System.out.println(v);
               // System.out.println(vpuntos);
                if (m < 0 || vmax < 0 || km < 0) {
                    System.out.println("ERROR");
                } else if (v <= vmax) {
                    System.out.println("OK");
                } else if ((v-vmax)>(0.2*vmax) ) {
                    System.out.println("PUNTOS");
                } else if ((v-vmax)<(0.2*vmax)) {
                    System.out.println("MULTA");
                }

            }
        } while (!(m == 0 && vmax == 0 && km == 0));

    }

}
