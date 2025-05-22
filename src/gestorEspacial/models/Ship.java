package gestorEspacial.models;

import java.util.Comparator;

public abstract class Ship implements Comparable<Ship> {

    private String name;
    private int crewCapacity;
    private int year;

    public Ship(String name, int crewCapacity, int year) {
        this.name = name;
        this.crewCapacity = crewCapacity;
        this.year = year;
    }

    public int getCrewCapacity() {
        return crewCapacity;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void startExploration() {
        System.out.println("Iniciando Exploracion, nave: "+ this.name);
    }

    public int comparteTo(Ship other) {
        //Ordenamiento de año decendente
        return Integer.compare(other.getYear(), this.getYear());
    }

    /**
     * Comparador por nombre alfabetico
     */
    public static Comparator<Ship> forName = new Comparator<Ship>() {
        @Override
        public int compare(Ship o1, Ship o2) {
            return o1.getName().compareToIgnoreCase(o2.getName());
        }
    };

    /**
     * Ordena por cantidad de tripulacion
     */
    public static Comparator<Ship> forCrew = new Comparator<Ship>() {
        @Override
        public int compare(Ship o1, Ship o2) {
            return Integer.compare(o1.getCrewCapacity(), o2.getCrewCapacity());
        }
    };

    /**
     * Compara si son naves iguales
     *
     * @param obj Nave a comparar
     * @return Validacion
     */
    public boolean equals(Object obj) {
        if (this == obj) return true; //En cuyo caso que el objeto sea totalmente igual
        if (obj == null || getClass() != obj.getClass()) return false;//En caso de que sean distintos
        Ship other = (Ship) obj;
        return this.getName().equalsIgnoreCase(other.getName()) && this.getYear() == other.getYear(); //Validacion por nombre y año
    }


    /**
     * Muestra la informacion de la nave
     */
    public void showInfo() {
        System.out.println("\n");
        System.out.println("*************************************");
        System.out.println("Nombre: " + this.name);
        System.out.println("Capacidad de tripulacion: " + this.crewCapacity);
        System.out.println("Año de lanzamiento: " + this.year);

    }

    @Override
    public int compareTo(Ship o) {
        return 0;
    }
}
