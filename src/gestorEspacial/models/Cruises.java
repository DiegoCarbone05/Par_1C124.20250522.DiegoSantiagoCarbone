package gestorEspacial.models;

public class Cruises extends Ship {
    private int passengersCant;

    public Cruises(String name, int tripulation, int age, int passengersCant){
        super(name, tripulation, age);
        this.passengersCant = passengersCant;
    }

    @Override
    public void startExploration() {
        super.startExploration();
    }
}
