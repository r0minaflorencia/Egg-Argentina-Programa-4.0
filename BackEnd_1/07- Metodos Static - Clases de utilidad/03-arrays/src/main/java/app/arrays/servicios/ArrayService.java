/* El paquete servicio, con los siguientes métodos:
1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
2) Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
3) Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
4) Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.*/
package app.arrays.servicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class ArrayService {

    private Scanner scan;

    public float[] inicializar_A(float array_A[]) {

        for (int i = 0; i < array_A.length; i++) {
            array_A[i] = (float) (Math.random() * 9 + 1);
        }
        return array_A;
    }

    public float[] inicializar_B(float array_B[], float array_A[]) {

        float relleno = (float) 0.5;

        for (int i = 0; i < array_B.length; i++) {
            for (int j = 0; j < 10; j++) {
                array_B[j] = array_A[j];
            }
            array_B[i] = relleno;
        }

        /* otra forma de hacerlo utilizando System.arrayCopy():
        for (int i = 0; i < array_B.length; i++) {
            System.arraycopy(array_A, 0, array_B, 0, 10);
            array_B[i] = relleno;
        } */

        return array_B;
    }

    public void mostrar(float array_A[], float array_B[]) {
        this.scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("""
                           Mostrar array: 
                            a- Array A
                            b- Array B""");
        String opcion = scan.next();

        if (opcion.equalsIgnoreCase("a")) {
            //mostrar A
            for (float A : array_A) {
                System.out.print("[" + A + "]");
            }

        } else if (opcion.equalsIgnoreCase("b")) {
            //mostrar B
            for (float B : array_B) {
                System.out.print("[" + B + "]");
            }

        } else {
            System.out.println("Ingrese una opción válida.");
        }

        System.out.println();
    }

    public void ordenar(float array_A[], float array_B[]) {
        this.scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("""
                           Ordenar array: 
                            a- Array A
                            b- Array B""");
        String opcion = scan.next();

        if (opcion.equalsIgnoreCase("a")) {

            Arrays.sort(array_A);   // Ordenar de menor a mayor.

            // Invertir el orden para obtener de mayor a menor:
            for (int i = 0; i < (array_A.length / 2); i++) {
                float temp = array_A[i];
                array_A[i] = array_A[array_A.length - 1 - i];
                array_A[array_A.length - 1 - i] = temp;
            }

            // Imprimir el array ordenado de mayor a menor
            System.out.println("Array ordenado de mayor a menor: " + Arrays.toString(array_A));

        } else if (opcion.equalsIgnoreCase("b")) {

            Arrays.sort(array_B);   // Ordenar de menor a mayor.

            // Invertir el orden para obtener de mayor a menor:
            for (int i = 0; i < (array_B.length / 2); i++) {
                float temp = array_B[i];
                array_B[i] = array_B[array_B.length - 1 - i];
                array_B[array_B.length - 1 - i] = temp;
            }

            // Imprimir el array ordenado de mayor a menor
            System.out.println("Array ordenado de mayor a menor: " + Arrays.toString(array_B));

        } else {
            System.out.println("Ingrese una opción válida.");
        }

    }

}
