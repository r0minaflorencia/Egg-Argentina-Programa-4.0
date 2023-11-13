package app.numeros.servicios;

import app.numeros.entidades.ParDeNumeros;

/**
 *
 * @author Romina
 */
public class ParDeNumerosServicio {

    /* a) Método mostrarValores que muestra cuáles son los dos números guardados. */
    public static void mostrarValores(ParDeNumeros nros) {
        System.out.println(nros.toString());
        System.out.println();  //  dejo espacio con la siguiente línea
    }

    /* b) Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor. */
    public static double devolverMayor(ParDeNumeros nros) {
        double valorMayor;
        
        if (nros.getNumero1() > nros.getNumero2()) {
            valorMayor = nros.getNumero1();
        } else {
            valorMayor = nros.getNumero2();
        }
        return valorMayor;
    }

    // tambien voy a retornar el menor valor para utilizarlo en futuras funciones
    public static double devolverMenor(ParDeNumeros nros) {
        double valorMenor;
        if (nros.getNumero1() < nros.getNumero2()) {
            valorMenor = nros.getNumero1();
        } else {
            valorMenor = nros.getNumero2();
        }
        return valorMenor;
    }

    /* c) Método calcularPotencia para calcular la potencia del mayor valor de
    la clase elevado al menor número. Previamente se deben redondear ambos valores. */
    public void calcularPotencia(ParDeNumeros nros) {
        
        int base = (int) Math.round(devolverMenor(nros));
        int exponente = (int) Math.round(devolverMayor(nros));
        double potencia = Math.pow(base, exponente);

        System.out.println("La potencia de " + base + " elevado a "
                + exponente + ", es igual a: " + potencia);

        System.out.println(); //  dejo espacio con la siguiente línea
    }

    /* d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
    Antes de calcular la raíz cuadrada se debe obtener el absoluto del número.*/
    public void calcularRaizCuadrada(ParDeNumeros nros) {

        int valorAbsoluto = (int) Math.abs(devolverMenor(nros));  //obtener el valor absouto 

        System.out.println("La raíz cuadrada de " + valorAbsoluto + " resulta: "
                + (int) (Math.sqrt(valorAbsoluto)));    // calcular raíz cuadrada
    }

}
