package gestorEspacial.models;

public class CargoShips extends Ship {
    private int cargeCapacity;


    public CargoShips(String name, int tripulation, int age, int cargeCapacity) {
        super(name, tripulation, age);

        /**
         * Valida que entre correctamente los valores
         */
        this.cargeCapacity = Math.max(100, Math.min(cargeCapacity, 500));
    }

    @Override
    public void startExploration() {
        super.startExploration();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Capacity: " + this.cargeCapacity);
    }
}
