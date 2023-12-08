package integrador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practica {

//    @param num
//    @return numeroCapicua
    public Boolean numeroCapicua(Integer num) {
        //convierto el num a String
        String numToString = Integer.toString(num);
        //en otra String guardo el reverso
        String numInvertido = new StringBuilder(numToString).reverse().toString();

        //si el número es negativo lo informo
        if (numToString.equals(numInvertido)) {
            return true;
        } else if (num < 0 && numToString.substring(1, numToString.length())
                .equals(numInvertido.substring(0, numInvertido.length() - 1))) {
            System.out.println("El número es negativo.");
            return true;
        } else if (num < 0) {
            System.out.println("El número es negativo.");
            return false;
        }
        return false;
    }

//     @param inicio
//     @param cantidadCaramelos
//     @param cantidadLadrones
//     @return ladronQueLeTocoElCarameloPodrido
    public int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadLadrones) {
        int ladrones[] = new int[cantidadLadrones];
        //inicializo todos los elementos del array en 0
        Arrays.fill(ladrones, 0);

        //en una variable almaceno el índice del que le tocó el caramelo podrido
        int carameloPodrido = 0;

        // Luego, asigna 1 caramelo a algunos ladrones según la cantidad disponible
        for (int i = inicio; i < inicio + cantidadCaramelos && i < cantidadLadrones; i++) {
            ladrones[i - 1] = 1;
            carameloPodrido = (inicio + cantidadCaramelos) - 1;
        }

        System.out.println(Arrays.toString(ladrones));

        return carameloPodrido;
    }

//    En un universo paralelo, donde los habitantes son medias, existe un crucero 
//    de medias donde se sube una lista de medias. 
//    Esta lista de tripulantes del crucero es una Collection de letras. 
//    Lo que se deberá hacer, es filtrar la lista de medias que se suben al crucero y 
//    retornar una lista que contenga los grupos de medias que si tenían pares. 
//    Esta lista final de medias pares se mostraran ordenadas de men or a mayor.
//    A continuación un ejemplo: 
//    List de medias que llegan : A,B,A,B,C,A,F,Z,C,H. A,B y C tiene pares, mientras que F,Z y H no. 
//    Entonces la List que se debería retornar sería: A,B,C.
//   @param pasajeros
//   @return mediasPares
    public ArrayList<Integer> mediasPares(List<String> medias) {
        //logica necesaria
        return null;
    }
}
