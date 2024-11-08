package Nivel_0;

import java.util.Scanner;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;

public class gilipollez1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario la cantidad de repeticiones
        System.out.print("¿Cuántas veces quieres repetir el mensaje? ");
        int repeticiones = scanner.nextInt();
        scanner.nextLine();  // Consumimos el salto de línea pendiente

        // Pedimos el mensaje que quiere repetir
        System.out.print("Introduce el mensaje que quieres repetir: ");
        String mensaje = scanner.nextLine();
        
        // Cerramos el scanner
        scanner.close();

        try {
            // Creamos un objeto Robot para simular la entrada de teclado
            Robot robot = new Robot();

            // Pausa antes de empezar para que puedas hacer clic en la barra de búsqueda o donde quieras escribir
            System.out.println("Tienes 5 segundos para hacer clic en la barra de búsqueda...");
            Thread.sleep(5000);

            // Simulamos la escritura del mensaje repetido
            for (int i = 0; i < repeticiones; i++) {
                escribirMensaje(robot, mensaje);
                
                // Simulamos el salto de línea (Enter) después de cada mensaje
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
            }

        } catch (AWTException | InterruptedException e) {
            System.out.println("Ocurrió un error al intentar escribir el mensaje.");
            e.printStackTrace();
        }
    }

    // Método para escribir un mensaje carácter por carácter
    private static void escribirMensaje(Robot robot, String mensaje) {
        for (char c : mensaje.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
            if (KeyEvent.CHAR_UNDEFINED != keyCode) {
                robot.keyPress(keyCode);
                robot.keyRelease(keyCode);
            }
            
            // Intentamos hacer una pausa entre cada carácter
            try {
                Thread.sleep(70);  // Pausa de 500 ms entre caracteres
            } catch (InterruptedException e) {
                System.out.println("Error al hacer la pausa entre caracteres.");
                e.printStackTrace();
            }
        }
    }
}
