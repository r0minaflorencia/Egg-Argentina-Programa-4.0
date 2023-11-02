package app.nespresso.servicios;

import app.nespresso.entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class CafeteraService {

    private Scanner scan;

    public Cafetera llenarCafetera() {

        //lleno la cafetera al 100%
        int capacidadMaxima = 100;
        int capacidadActual = capacidadMaxima;

        System.out.println("se llenó la cafetera.");

        return new Cafetera(capacidadMaxima, capacidadActual);
    }

    public int servir(Cafetera cafetera) {
        this.scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Servir café en: ");

        //opciones
        int pocillo = 40, taza = 75, tazaGrande = 100;
        System.out.println("\n a- pocillo"
                + "\n b- taza"
                + "\n c- taza grande");
        System.out.println();
        System.out.print("elegir: ");
        String opcion = scan.next();

        switch (opcion.toLowerCase()) {
            //según la opción elegida:
            case "a":
                if (cafetera.getCapacidadActual() >= pocillo) {
                    cafetera.setCapacidadActual((cafetera.getCapacidadActual() - pocillo));
                    System.out.println("servir pocillo.");

                    return pocillo;
                } else {
                    System.out.println("no hay suficiente café, pronto tendremos otra opción para ofrecerte");
                }
                break;

            case "b":
                if (cafetera.getCapacidadActual() >= taza) {
                    cafetera.setCapacidadActual((cafetera.getCapacidadActual() - taza));
                    System.out.println("servir taza.");

                    return taza;
                } else {
                    System.out.println("no hay suficiente café, te ofreceremos otra opción en breve");
                }
                break;

            case "c":
                if (cafetera.getCapacidadActual() >= tazaGrande) {
                    cafetera.setCapacidadActual((cafetera.getCapacidadActual() - tazaGrande));
                    System.out.println("servir taza grande.");

                    return tazaGrande;
                } else {
                    System.out.println("no hay suficiente café, te ofreceremos otra opción a la brevedad");
                }
                break;
        }

        //else
        return 0;

    }

    public void vaciarCafetera(Cafetera cafetera) {
        this.scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println();
        System.out.println("¿Vaciar cafetera?"
                + "\n s- Si"
                + "\n n- No");
        String respuesta = scan.next();

        if (respuesta.equalsIgnoreCase("a")) {
            cafetera.setCapacidadActual(0);
            System.out.println();
            System.out.print("Vaciando la cafetera...");
        } else if (respuesta.equalsIgnoreCase("b")) {
            System.out.println("Se canceló la operación.");
        } else {
            System.out.println("Opción no disponible.");
        }

        System.out.println(cafetera.toString());
    }

    public void recargar(Cafetera cafetera) {
        this.scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println();
        System.out.println("¿Recargar cafetera?"
                + "\n s- Si"
                + "\n n- No");
        String respuesta = scan.next();

        if (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Indica el porcentaje de café que deseas agregar: ");
            int recarga = scan.nextInt();

            if (recarga <= (cafetera.getCapacidadMaxima() - cafetera.getCapacidadActual())) {
                cafetera.setCapacidadActual((cafetera.getCapacidadActual() + recarga));
                System.out.println("Se cargó la cafetera correctamente");
                System.out.println(cafetera.toString());
            } else {
                System.out.println("La cantidad indicada excede la capacidad máxima de la cafetera."
                        + " Verifique el espacio disponible y vuelva a intentarlo");
            }
        } else if (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n")) {
            System.out.println("Opción no disponible.");
        }

    }

}
