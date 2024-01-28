package com.app.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.app.utilities.PalosEnum;
import com.app.utilities.ValoresEnum;

public class Baraja {

    // defino un arrayList para almacenar todas las cartas
    private List<Carta> mazo;
    private List<Carta> cartasAdquiridas;
    private Iterator<Carta> it;

    // constructor que inicializa la lista de cartas
    public Baraja() {
        mazo = new ArrayList<>();
        inicializarBaraja();
        cartasAdquiridas = new ArrayList<>();
        it = mazo.iterator();
    }

    // metodo privado para inicializar la baraja con todas las cartas
    private void inicializarBaraja() {
        for (PalosEnum palo : PalosEnum.values()) {
            for (ValoresEnum valor : ValoresEnum.values()) {
                mazo.add(new Carta(valor, palo));
            }
        }
    }

    // metodo para mostrar todas las cartas de la baraja
    public void mostrarDisponibles() {
        for (Carta carta : mazo) {
            System.out.println(carta);
        }

        System.out.println("Cantidad de cartas: " + mazo.size());

    }

    public void barajar() {
        Collections.shuffle(mazo);
    }

    public Carta siguienteCarta() {
        Carta carta;

        if (it.hasNext()) {
            carta = it.next(); // asigno al objeto carta el elemento actual del iterador;
            cartasAdquiridas.add(carta); // la agrego a la lista de cartas adquiridas;
            it.remove(); // elimino el elemento actual sobre el cual estoy iterando del mazo;
            System.out.println("toma la siguiente carta: " + carta.toString());
            return carta;
        } else {
            System.out.println("No quedan mas cartas en el mazo");
            return null;
        }
    }

    public List<Carta> adquirirCartas(int cantidad) {

        for (int i = 0; i < cantidad; i++) {
            siguienteCarta();
        }

        return cartasAdquiridas;
    }

    public void mostrarCartasAdquiridas() {
        if (!cartasAdquiridas.isEmpty()) {
            System.out.println(cartasAdquiridas.toString());
        } else {
            System.out.println("Todavia no se han repartido cartas.");
        }
    }

    public void cantidadDeCartasDisponibles() {
        System.out.println("Quedan " + mazo.size() + " de cartas disponibles en el mazo.");
    }

    // get & set
    public List<Carta> getMazo() {
        return mazo;
    }

    public List<Carta> getCartasAdquiridas() {
        return cartasAdquiridas;
    }

    public void setCartasAdquiridas(List<Carta> cartasAdquiridas) {
        this.cartasAdquiridas = cartasAdquiridas;
    }

}