package app.numeros;

import app.numeros.entidades.ParDeNumeros;
import app.numeros.servicios.ParDeNumerosServicio;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        System.out.println(" /// Welcome /// ");
        ParDeNumeros nros = new ParDeNumeros();
        ParDeNumerosServicio serviceClass = new ParDeNumerosServicio();

        //mostrar:
        serviceClass.mostrarValores(nros);

        //devolver nro con mayor valor:
        System.out.println("El número de mayor valor es: " + serviceClass.devolverMayor(nros));
        System.out.println();   //dejo una línea de espacio

        // calcualar potencia
        serviceClass.calcularPotencia(nros);

        //calcular raíz cuadrada del nro de menor valor
        serviceClass.calcularRaizCuadrada(nros);

    }
}
