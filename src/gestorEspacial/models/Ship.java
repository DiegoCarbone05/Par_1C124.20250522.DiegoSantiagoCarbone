package gestorEspacial.models;

public abstract class Ship implements Comparable<Ship> {

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
        System.out.println("\n");
        System.out.println("*************************************");
        System.out.println("Nombre: "+ this.name);
        System.out.println("Capacidad de tripulacion: "+ this.capTripulation);
        System.out.println("Año de lanzamiento: "+ this.year);

    }

    @Override
    public int compareTo(Ship o) {
        return 0;
    }
}
