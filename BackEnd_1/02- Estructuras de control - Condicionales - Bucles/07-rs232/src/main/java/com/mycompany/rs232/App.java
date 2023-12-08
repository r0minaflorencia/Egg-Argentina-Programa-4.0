/*7. Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario.
Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo,
el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&”
marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
Nota: investigar las siguientes funciones de Java Substring(), Length(), equals().*/
package com.mycompany.rs232;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input;
        boolean FDE = false;
        int correct = 0, incorrect = 0;

        do {
            System.out.print("Input: ");
            input = sc.next();
            if (input.length() <= 5 && input.substring(0, 1).equalsIgnoreCase("x") && input.substring(input.length() - 1, input.length()).equalsIgnoreCase("o")) {
                correct = correct + 1;
            } else if (input.equals("&&&&&")) {
                FDE = true;
            } else {
                incorrect = incorrect + 1;
            }
        } while (FDE == false);

        System.out.println("Fin de envíos");
        System.out.println("La cantidad de envíos correctos es: " + correct);
        System.out.println("La cantidad de envíos incorrectos es: " + incorrect);
    }

}
