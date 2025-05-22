package gestorEspacial.models;

public class Exploration extends Ship {
    private EMision misionType;

    public Exploration(String name, int tripulation, int age, EMision misionType){
        super(name, tripulation, age);
        this.misionType = misionType;
    }

    @Override
    public void startExploration() {
        super.startExploration();
    }
}
