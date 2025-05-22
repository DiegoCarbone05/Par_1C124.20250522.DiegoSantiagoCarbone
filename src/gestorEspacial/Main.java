/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestorEspacial;

import gestorEspacial.models.CargoShips;
import gestorEspacial.models.EMision;
import gestorEspacial.models.Ship;

/**
 *
 * @author diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CargoShips newCargoShip = new CargoShips("Nostromo", 10, 1574, EMision.INVESTIGATION);

        newCargoShip.showInfo();

    }
    
}
