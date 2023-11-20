package app.extra.adivinar_mes_secreto.servicios;

import app.extra.adivinar_mes_secreto.entidades.Meses;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class MesesServicio {

    private Scanner scan;

    public void adivinarMes() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
        // defino el mes secreto
        Meses mesSecreto = Meses.abril;
        
        boolean encontrado;

        do {
            System.out.print("Adivina el mes: ");
            String input = scan.next();
            
            if (input.equalsIgnoreCase(mesSecreto.toString())) {
                System.out.println("Has acertado, el mes secreto es " + mesSecreto.toString());
                encontrado = true;
            } else {
                System.out.println("Sigue intentando!");
                encontrado = false;
            }
        } while (!encontrado);
    }

}
