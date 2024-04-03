package com.example.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import com.example.entities.BarcoMotor;
import com.example.entities.Cliente;
import com.example.entities.Nave;
import com.example.entities.Velero;
import com.example.entities.Yate;

public class Alquiler {

    private double subTotal, total;
    private Scanner scan;

    public Alquiler() {
        this.scan = new Scanner(System.in);
    }

    /*
     * En los barcos de tipo especial el módulo de cada barco se calcula sacando el
     * módulo normal y
     * sumándole el atributo particular de cada barco. En los veleros se suma el
     * número de mástiles,
     * en los barcos a motor se le suma la potencia en CV y en los yates se suma la
     * potencia en CV y el número de camarotes.
     */

    public void menu() {
        boolean flag = false;
        NaveService barco = new NaveService();

        do {
            System.out.println("Menú" +
                    "\n Seleccioná el tipo de barco que deseas alquilar: " +
                    "\n a- Velero" +
                    "\n b- Barco a motor" +
                    "\n c- Yate" +
                    "\n d- salir");
            char opcion = scan.next().toLowerCase().charAt(0);

            switch (opcion) {
                case 'a':
                    Velero velero = barco.crearVelero();
                    total = ((pedido(new Cliente("John", "Snow", 123456), velero)) + velero.getNroMastiles());
                    System.out.println("El costo del alquiler es de $" + total);
                    flag = true;
                    break;
                case 'b':
                    BarcoMotor barcoMotor = barco.crearBarcoMotor();
                    total = ((pedido(new Cliente("John", "Snow", 123456), barcoMotor))
                            + barcoMotor.getPotenciaCV());
                    System.out.println("El costo del alquiler es de $" + total);
                    flag = true;
                    break;
                case 'c':
                    Yate yate = barco.crearYate();
                    total = ((pedido(new Cliente("John", "Snow", 123456), yate))
                            + yate.getPotenciaCV() + yate.getCantidadCamarotes());
                    System.out.println("El costo del alquiler es de $" + total);
                    flag = true;
                    break;
                case 'd':
                    flag = true;
                default:
                    System.out.println("Debes ingresar una opción válida.");
                    break;
            }

        } while (!flag);

    }

    /*
     * Un alquiler se calcula multiplicando el número de días de ocupación
     * (calculado con la fecha de alquiler y devolución),
     * por un valor módulo de cada barco (obtenido simplemente
     * multiplicando por 10 los metros de eslora).
     */
    public double pedido(Cliente cliente, Nave barco) {
        System.out.print("Posición amarre: ");
        int posicionAmarre = scan.nextInt();
        cliente.setPosicionAmarre(posicionAmarre);
        System.out.print("Fecha alquiler (ddMMaaaa): ");
        String fechaAlquilerString = scan.next();
        System.out.print("Fecha devolución (ddMMaaaa): ");
        String fechaDevolucionString = scan.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy"); // le doy un formato a la fecha
        LocalDate fechaAlquiler = LocalDate.parse(fechaAlquilerString, formatter);
        System.out.println("Fecha de alquiler: " + fechaAlquiler); // informo
        LocalDate fechaDevolucion = LocalDate.parse(fechaDevolucionString, formatter);
        System.out.println("Fecha devolución: " + fechaDevolucion); // informo

        // setteo
        cliente.setFechaAlquiler(fechaAlquiler);
        cliente.setFechaDevolucion(fechaDevolucion);
        cliente.setBarco(barco);

        // comienzo a calcular el valor del alquiler:
        int valorModulo = (barco.getEslora() * 10);
        long diferenciaDias = ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion); // calcula la diferencia en días
        int cantidadDiasInt = (int) diferenciaDias; // convierto a entero
        subTotal = valorModulo * cantidadDiasInt;

        return subTotal;
    }

}
