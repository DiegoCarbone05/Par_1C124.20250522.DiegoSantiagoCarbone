package gestorEspacial.models;

public class Ship {

    private String name;
    private int capTripulation;
    private int year;

    public Ship(String name, int capTripulation, int year){
        this.name = name;
        this.capTripulation = capTripulation;
        this.year = year;
    }

    public void startExploration(){
        System.out.println("Iniciando Exploracion");
    }

    public void showInfo(){
        System.out.println("");
        System.out.println("*************************************");
        System.out.println("Nombre: "+ this.name);
        System.out.println("Capacidad de tripulacion: "+ this.capTripulation);
        System.out.println("Año de lanzamiento: "+ this.year);
        System.out.println("*************************************");

    }

}
