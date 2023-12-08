/* 4. Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.*/
package com.mycompany.extra.registro.alumnos.de.curso;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Extra04RegistroAlumnosDeCurso {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        int arrayPromedios[] = new int[10];

        cargarNotasYSacarPromedio(arrayPromedios, scan);
        obtenerAprobados(arrayPromedios);

    }

    public static void cargarNotasYSacarPromedio(int arrayPromedios[], Scanner scan) {

        double tp1, tp2, parcial1, parcial2, promedio;

        for (int i = 0; i < arrayPromedios.length; i++) {
            System.out.println("Notas del " + (i + 1) + "° alumno/a");
            System.out.print("Nota del primer TP: ");
            tp1 = scan.nextDouble();
            System.out.print("Nota del segundo TP: ");
            tp2 = scan.nextDouble();
            System.out.print("Nota del primer parcial: ");
            parcial1 = scan.nextDouble();
            System.out.print("Nota del segundo parcical: ");
            parcial2 = scan.nextDouble();

            promedio = Math.round((tp1 * 0.10) + (tp2 * 0.15) + (parcial1 * 0.25) + (parcial2 * 0.50));

            arrayPromedios[i] = (int) promedio;
        }

        //mostrar
        for (int i = 0; i < arrayPromedios.length; i++) {
            System.out.println((i + 1) + "° alumno = promedio [" + arrayPromedios[i] + "]");
        }

    }

    public static void obtenerAprobados(int arrayPromedios[]) {

        int aprobados = 0, desaprobados = 0;

        for (int i = 0; i < arrayPromedios.length; i++) {
            if (arrayPromedios[i] >= 7) {
                aprobados++;
            } else if (arrayPromedios[i] < 7) {
                desaprobados++;
            }
        }

        System.out.println("La cantidad de aprobados es: " + aprobados);
        System.out.println("La cantidad de desaprobados es: " + desaprobados);

    }
}
