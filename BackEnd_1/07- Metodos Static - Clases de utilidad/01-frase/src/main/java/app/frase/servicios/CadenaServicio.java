package app.frase.servicios;

import app.frase.entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class CadenaServicio {

    private Scanner scan;

    public Cadena crear() {
        this.scan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingresa una frase: ");
        String frase = scan.next();

        return new Cadena(frase, frase.length());
    }

    public void contabilizarVocales(Cadena cadena) {
        char vocales[] = {'a', 'e', 'i', 'o', 'u'};
        String frase = cadena.getFrase().toLowerCase();
        int contadorVocales = 0;

        for (int i = 0; i < cadena.getLongitud(); i++) {

            char letra = frase.charAt(i);

            //verificar si la letra es una vocal:
            for (char vocal : vocales) {
                if (letra == vocal) {
                    contadorVocales++;
                    break; // Rompe el bucle una vez que se encuentra una vocal
                }
            }
        }

        System.out.println("Hay " + contadorVocales + " vocales en la frase ingresada.");
    }

    public void invertir(Cadena cadena) {
        System.out.println();
        System.out.println("Frase invertida: ");
        //utilizo el metodo .reverse() de la clase StringBuilder para invertir la frase
        System.out.println(new StringBuilder(cadena.getFrase()).reverse().toString());

    }

    public void vecesRepetido(Cadena cadena) {
        this.scan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("¿Qué letra deseas buscar en la frase?: ");
        String letra = scan.next();

        if (buscarLetra(cadena, letra)) {

            int contador = 0;
            for (int i = 0; i < cadena.getLongitud(); i++) {

                if (cadena.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                    contador++;
                }
            }

            System.out.println("La letra '" + letra + "' se encuentra: " + contador + " veces.");

        } else {
            System.out.println("No se encuentra la letra indicada.");
        }
        System.out.println();
    }

    public void compararLongitud(Cadena cadena) {
        System.out.print("Ingresa una nueva frase para comparar la longitud entre ambas: ");
        String nuevaFrase = scan.next();

        if (cadena.getLongitud() > nuevaFrase.length()) {
            System.out.println("La frase mas larga es la ingresada anteriormente.");
        } else if (cadena.getLongitud() == nuevaFrase.length()) {
            System.out.println("Ambas frases tienen la misma longitud.");
        } else {
            System.out.println("La frase mas larga es la última ingresada.");
        }

        System.out.println();
    }

    public void unirFrases(Cadena cadena) {
        this.scan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingresar una frase para concatenar con la frase original: ");
        String aConcatenar = scan.next();

        System.out.println("Frases concatenadas: ");
        System.out.println(cadena.getFrase() + " " + aConcatenar);
        System.out.println();
    }

    public void reemplazar(Cadena cadena) {
        this.scan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("¿Qué letra de la frase deseas reemplazar?: ");
        String letra = scan.next();
        System.out.print("¿Con qué caracter deseas reemplazarla?: ");
        String caracter = scan.next();

        System.out.println("Frase con letras " + letra + " reemplazadas: ");
        System.out.println(cadena.getFrase().replaceAll(letra, caracter));
        System.out.println();
    }

    public boolean buscarLetra(Cadena cadena, String letra) {
        this.scan = new Scanner(System.in).useDelimiter("\n");

        boolean encontrada = false;

        for (int i = 0; i < cadena.getLongitud(); i++) {

            if (cadena.getFrase().contains(letra)) {
                encontrada = true;
            } else {
                encontrada = false;
            }

        }

        System.out.println("El resultado de la busqueda de la letra '" + letra + "' es: " + encontrada);
        return encontrada;
    }

}
