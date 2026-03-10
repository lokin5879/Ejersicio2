/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busproyecto;

/**
 *
 * @author AYRTON
 */
public class BusProyecto {


    public static void main(String[] args) {

        Bus bus1 = new Bus(40);

        bus1.subirPasajeros(15);
        bus1.cobrarPasaje();
        bus1.asientosDisponibles();

    }
}

