package integrador;

//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Scanner;

public class Integrador {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Practica practica = new Practica();

        System.out.print("Ingresa un número: ");
        int num = scan.nextInt();
        System.out.println("¿Es capicúa? " + practica.numeroCapicua(num));
        System.out.println();

        System.out.print("Cantidad de caramelos a repartir: ");
        int cantidadCaramelos = scan.nextInt();
        System.out.print("Cantidad de ladrones: ");
        int cantidadLadrones = scan.nextInt();
        System.out.print("Inicio de la ronda: ");
        int inicio = scan.nextInt();
        System.out.println("El caramelo podrido le tocó al ladrón n° "
                + practica.prisioneroDulce(inicio, cantidadCaramelos, cantidadLadrones));
        System.out.println(); 
        
        
        //INCOMPLETO:
        
        //System.out.println((int) Math.log10(1000) + 1);
        
        /*ArrayList<String> medias = new ArrayList(Arrays.asList(new String[]{
            "A", "B", "E", "D", "A", "C", "D", "I"}));
        practica.mediasPares(medias);*/
    }
}
