package gestorEspacial.models;

public class Cruises extends Ship {
    private int passengersCant;

    public Cruises(String name, int Crew, int age, int passengersCant){
        super(name, Crew, age);
        this.passengersCant = passengersCant;
    }

    @Override
    public void startExploration() {
        super.startExploration();
    }
}
