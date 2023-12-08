package app.frase;

import app.frase.entidades.Cadena;
import app.frase.servicios.CadenaServicio;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        //welcome
        System.out.println(" /// Welcome /// ");
        CadenaServicio serviceClass = new CadenaServicio();

        //crear 
        Cadena frase = serviceClass.crear();

        //contabilizar vocales
        serviceClass.contabilizarVocales(frase);
       
        //invertir
        serviceClass.invertir(frase);
        
        //buscar letra
        serviceClass.vecesRepetido(frase);
        
        //comparar longitud
        serviceClass.compararLongitud(frase);
        
        //concatenar
        serviceClass.unirFrases(frase);
        
        //reemplazar
        serviceClass.reemplazar(frase);
        
        
    }
}
