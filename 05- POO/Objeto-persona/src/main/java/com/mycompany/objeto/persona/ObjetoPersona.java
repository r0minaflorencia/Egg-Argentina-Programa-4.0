/* Crea tu propio proyecto con la clase Persona.
Deberás sumarle 3 atributos que creas pertinentes.
Vamos a crear objetos en tu Main utilizando los constructores.
Continuaremos con nuestra clase Persona y vamos a primero crear los getter y
setter y después invocarlos desde el Main con alguno de los objetos que instanciaste. */
package com.mycompany.objeto.persona;

import com.mycompany.objeto.persona.entidades.Persona;
import java.util.Date;

/**
 *
 * @author Romina
 */
public class ObjetoPersona {

    public static void main(String[] args) {

        //instanciar 
        Persona persona1 = new Persona(143456, new Date(1997,10,19) , "Juan");
        Persona persona2 = new Persona(123554, new Date(1994,04,28), "Romina");
        Persona persona3 = new Persona(115986, new Date(1992,06,12), "Lara");

        //mostrar
        System.out.println("Lista de personas: ");
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());

    }
}
