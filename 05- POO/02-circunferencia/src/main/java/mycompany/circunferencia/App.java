/* 2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖 π*radio〗^2).
e) Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio). */
package mycompany.circunferencia;

import mycompany.circunferencia.entidades.Circunferencia;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        //welcome
        System.out.println("Circunferencia");

        //instanciar
        Circunferencia circunferencia1 = new Circunferencia();

        //llamar método 
        circunferencia1.crearCircunferencia();

        //mostrar
        System.out.println(circunferencia1.toString());
        System.out.println("{área: " + circunferencia1.area() + "}");
        System.out.println("{perímetro: " + circunferencia1.perimetro() + "}");

    }

}
