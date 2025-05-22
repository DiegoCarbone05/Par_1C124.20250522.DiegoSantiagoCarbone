package gestorEspacial;

import gestorEspacial.models.Ship;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpacialAgency {

    List<Ship> shipList;

    public SpacialAgency(){
        shipList = new ArrayList<>();
    }


    /**
     * Muestra todas las naves (si no hay ninguna retorna un mensaje de error)
     */
    public void showShips() {
        if (shipList.isEmpty()) {
            System.out.println("!! No hay naves disponibles !!");
            return;
        }
        for(Ship ship: shipList){
            ship.showInfo();
        }
    }

    /**
     * Agrega una nave de tipo Abstract Ship a la lista
     * @param ship nueva nave
     */
    public void addShip(Ship ship) {
        if (!shipList.contains(ship)){
            shipList.add(ship);
            System.out.println(" ** Nave agregada correctamente! ** ");
        }else{
            System.out.println(" !! Ya existe una nave con ese nombre y año de lanzamiento. !! ");

        }
    }

    public void startExploration(){
        for (Ship ship : shipList){
            ship.startExploration();
        }
    }

    public void shipNameSort(){
        shipList.sort(Ship.forName);
        showShips();
    }
    public void shipYearSort(){
        Collections.sort(shipList);
        System.out.println("LISTA POR AÑO DECENDENTE");
        showShips();

    }
    public void shipCrewSort(){
        shipList.sort(Ship.forCrew);
        showShips();
    }

}
