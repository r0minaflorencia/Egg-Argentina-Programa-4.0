/* 1. Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá́ definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes.*/
package com.mycompany.extra.cancion;

import com.mycompany.extra.cancion.entidades.Cancion;

/**
 *
 * @author Romina
 */
public class ExtraCancion {

    public static void main(String[] args) {
       
        Cancion cancion = new Cancion();
        
        cancion.crearCancion();
        
        System.out.println(cancion.toString());
        
    }
}
