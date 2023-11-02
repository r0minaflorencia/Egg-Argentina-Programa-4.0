package app.extra.digito.verificador.servicios;

import app.extra.digito.verificador.entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class NIFServicio {

    //vector que contiene valores char
    private static final char letra[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    //scanner
    private Scanner scan;
    
    public NIF crear() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println();

        int numero;
        boolean entradaValida = false;

        //validar que el usuario ingrese ocho dígitos
        do {
            System.out.print("Número de DNI: ");
            numero = scan.nextInt();
            String numeroComoCadena = String.valueOf(numero);

            if (numeroComoCadena.length() == 8) {
                entradaValida = true;
            } else {
                System.out.println("Debes ingresar 8 dígitos.");
            }

        } while (!entradaValida);

        return new NIF(numero, letra[(int) numero % 23]);
    }

}
