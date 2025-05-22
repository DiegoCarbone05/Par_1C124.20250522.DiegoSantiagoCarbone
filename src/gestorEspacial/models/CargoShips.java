package gestorEspacial.models;

public class CargoShips extends Ship {
    private EMision misionType;

    public CargoShips(String name, int tripulation, int age, EMision misionType){
        super(name, tripulation, age);
        this.misionType = misionType;
    }

    @Override
    public void startExploration() {
        super.startExploration();
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }
}
