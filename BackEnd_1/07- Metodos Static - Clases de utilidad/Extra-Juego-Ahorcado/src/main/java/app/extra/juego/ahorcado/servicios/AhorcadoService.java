package app.extra.juego.ahorcado.servicios;

import app.extra.juego.ahorcado.entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class AhorcadoService {

    public Ahorcado crearJuego() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingresa la palabra: ");
        String palabra = scan.next();
        System.out.print("Ingresa la cantidad máxima de intentos: ");
        int chances = scan.nextInt();

        return new Ahorcado(palabra.toCharArray(), chances, palabra);
    }

    public static int longitud(Ahorcado juego) {
        return juego.getPalabra().length();
    }

    public static int contadorDeLetrasEncontradas(Ahorcado juego, char letraIngresada) {
        int contador = 0;

        for (char letra : juego.getVector()) {
            if (letra == letraIngresada) {
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("La letra ingresada no se encuentra en la palabra.");
            juego.setChances(juego.getChances() - 1);
        } else if (contador == 1) {
            System.out.println("La letra se encuentra una vez en la palabra.");
        } else if (contador > 1) {
            System.out.println("La letra se encuentra " + contador + " veces en la palabra.");
        }

        System.out.println("Has encontrado " + contador + " de " + juego.getPalabra().length()
                + " letras.");

        System.out.println("Intentos disponibles: " + juego.getChances());

        return contador;
    }

    public static char ingresar() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingresa una letra: ");
        String input = scan.next().toLowerCase();

        char letraIngresada = input.charAt(0);

        return letraIngresada;
    }

    public void jugar() {

        System.out.println("Juego del ahorcado");
        Ahorcado juego = crearJuego();

        System.out.println("Longitud de la palabra: " + longitud(juego));

        int letrasEncontradas, suma = 0;

        do {
            letrasEncontradas = contadorDeLetrasEncontradas(juego, ingresar());
            suma = suma + letrasEncontradas;

            System.out.println();

            if (suma == juego.getPalabra().length()) {
                System.out.println("¡Has adivinado la palabra!: "
                        + juego.getPalabra().toUpperCase());
                break;
            }

        } while (juego.getChances() > 0);

        if (juego.getChances() == 0) {
            System.out.println("Game Over");
        }

    }

}
