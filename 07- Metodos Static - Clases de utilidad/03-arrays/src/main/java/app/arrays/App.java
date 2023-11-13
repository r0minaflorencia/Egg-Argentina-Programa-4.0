/* 3. Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales.
Inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B. */
package app.arrays;

import app.arrays.servicios.ArrayService;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {
        
        System.out.println(" /// Welcome /// ");
        ArrayService serviceClass = new ArrayService();
        
        //crear e inicializar arrays
        float array_A[] = new float[50];
        serviceClass.inicializar_A(array_A);

        float array_B[] = new float[20];
        serviceClass.inicializar_B(array_B, array_A);
  
        //mostrar
        serviceClass.mostrar(array_A, array_B);
        
        //ordenar
        serviceClass.ordenar(array_A, array_B);
        
    }
}
