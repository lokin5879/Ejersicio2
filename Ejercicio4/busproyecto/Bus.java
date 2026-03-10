/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busproyecto;

/**
 *
 * @author AYRTON
 */
public class Bus {

    int capacidad;
    int pasajeros;
    double dinero;
    double costoPasaje = 1.50;

    public Bus(int capacidad) {
        this.capacidad = capacidad;
        this.pasajeros = 0;
        this.dinero = 0;
    }

    public void subirPasajeros(int x) {
        if (pasajeros + x <= capacidad) {
            pasajeros += x;
            System.out.println(x + " pasajeros subieron al bus.");
        } else {
            System.out.println("No hay suficientes asientos.");
        }
    }

    public void cobrarPasaje() {
        dinero = pasajeros * costoPasaje;
        System.out.println("Dinero recaudado: Bs " + dinero);
    }

    public void asientosDisponibles() {
        int disponibles = capacidad - pasajeros;
        System.out.println("Asientos disponibles: " + disponibles);
    }
}

