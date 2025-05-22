/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestorEspacial;

import gestorEspacial.models.CargoShips;
import gestorEspacial.models.EMision;
import gestorEspacial.models.Exploration;
import gestorEspacial.models.Ship;

/**
 *
 * @author diego
 */
public class Main {

    static SpacialAgency specialAgency = new SpacialAgency();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Exploration exShip1 = new Exploration("Nostromo", 10, 1574, EMision.INVESTIGATION);
        Exploration exShip2 = new Exploration("Sevastopol", 50, 1995, EMision.CONTACT);

        specialAgency.addShip(exShip1);
        specialAgency.addShip(exShip2);
        specialAgency.showShips();

    }
    
}
