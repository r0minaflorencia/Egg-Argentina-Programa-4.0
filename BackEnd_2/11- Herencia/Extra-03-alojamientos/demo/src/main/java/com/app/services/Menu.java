package com.app.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.app.entities.Alojamiento;
import com.app.entities.Camping;
import com.app.entities.CincoEstrellas;
import com.app.entities.CuatroEstrellas;
import com.app.entities.Residencia;

public class Menu {

    private Scanner scan;
    private ArrayList<Alojamiento> all;
    private CampingService campingService;
    private ResidenciaService residenciaService;
    private CuatroEstrellasService cuatroEstrellasService;
    private CincoEstellasService cincoEstellasService;
    private ArrayList<Camping> campings;
    private ArrayList<Residencia> residencias;
    private ArrayList<CuatroEstrellas> cuatroEstrellas;
    private ArrayList<CincoEstrellas> cincoEstrellas;

    public Menu() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
        this.all = new ArrayList<>();
        this.campingService = new CampingService();
        this.residenciaService = new ResidenciaService();
        this.cuatroEstrellasService = new CuatroEstrellasService();
        this.cincoEstellasService = new CincoEstellasService();
        this.campings = campingService.lista();
        this.residencias = residenciaService.lista();
        this.cuatroEstrellas = cuatroEstrellasService.lista();
        this.cincoEstrellas = cincoEstellasService.lista();
    }

    /*
     * Coming soon:
     */
    public double calcularPrecios() {
        // TODO here
        return 0;
    }

    public void mostrarMenu() {
        boolean salir = false;
        do {

            System.out.println("\n Menú");
            System.out.println("Buscar alojamiento en" +
                    "\n a- Hoteles" +
                    "\n b- Alojamientos alternativos" +
                    "\n c- Mostrar todos" +
                    "\n d- Salir");
            char buscar = scan.next().toLowerCase().charAt(0);
            switch (buscar) {
                case 'a':
                    buscarHoteles(cuatroEstrellas, cincoEstrellas);
                    break;
                case 'b':
                    buscarAlternativos(campings, residencias);
                    break;
                case 'c':
                    listarTodos();
                    break;
                case 'd':
                    salir = true;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Debes seleccionar una opción válida.");
                    break;
            }
        } while (!salir);

    }

    public void buscarHoteles(ArrayList<CuatroEstrellas> cuatroEstrellas, ArrayList<CincoEstrellas> cincoEstrellas) {
        boolean flag = false;
        do {
            System.out.println("\n Buscar" +
                    "\n a- 5 Estrellas" +
                    "\n b- 4 Estrellas" +
                    "\n c- Salir");
            char opcion = scan.next().toLowerCase().charAt(0);

            switch (opcion) {
                case 'a':
                    seleccionarCincoEstrellas();
                    break;
                case 'b':
                    seleccionarCuatroEstrellas();
                    break;
                case 'c':
                    flag = true;
                    break;
                default:
                    System.out.println("Debes seleccionar una opción válida.");
                    break;
            }
        } while (!flag);
    }

    public void buscarAlternativos(ArrayList<Camping> campings, ArrayList<Residencia> residencias) {
        boolean flag = false;
        do {
            System.out.println("\n Buscar" +
                    "\n a- Campings" +
                    "\n b- Residencias" +
                    "\n c- Salir");
            char opcion = scan.next().toLowerCase().charAt(0);

            switch (opcion) {
                case 'a':
                    seleccionarCamping();
                    break;
                case 'b':
                    seleccionarResidencia();
                    break;
                case 'c':
                    flag = true;
                    break;
                default:
                    System.out.println("Debes seleccionar una opción válida.");
                    break;
            }
        } while (!flag);

    }

    public void seleccionarCincoEstrellas() {
        for (CincoEstrellas cincoE : cincoEstrellas) {
            System.out.println(cincoE.toString());
        }
    }

    public void seleccionarCuatroEstrellas() {
        for (CuatroEstrellas cuatroE : cuatroEstrellas) {
            System.out.println(cuatroE.toString());
        }
    }

    public void seleccionarResidencia() {
        for (Residencia r : residencias) {
            System.out.println(r.toString());
        }
    }

    public void seleccionarCamping() {
        for (Camping c : campings) {
            System.out.println(c.toString());
        }
    }

    public ArrayList<Alojamiento> listarTodos() {

        all.addAll(campings);
        all.addAll(residencias);
        all.addAll(cuatroEstrellas);
        all.addAll(cincoEstrellas);

        for (Alojamiento a : all) {
            System.out.println("\n " + a.toString());
        }

        return all;
    }

}
