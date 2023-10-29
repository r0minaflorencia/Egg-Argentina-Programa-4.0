/* 4. Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. 
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario.
También incluirá un método para calcular la superficie (Superficie = base * altura) 
y un método para calcular el perímetro. (Perímetro = (base + altura) * 2.)
Por último, tendremos un método que dibujará el rectángulo mediantebasteriscos usando la base y la altura. 
Se deberán además definir los métodos getters, setters y constructores correspondientes. */
package com.mycompany.crear.rectangulo;

import com.mycompany.crear.rectangulo.entidades.Rectangulo;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        System.out.println("Crear rectángulo");
        
        Rectangulo rectangulo = new Rectangulo();

        rectangulo.crear();
        rectangulo.dibujar();
        rectangulo.calcularSuperficie();
        rectangulo.calcularPerimetro();
        
    }
}
