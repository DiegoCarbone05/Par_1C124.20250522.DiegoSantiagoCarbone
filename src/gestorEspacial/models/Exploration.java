package gestorEspacial.models;

public class Exploration extends Ship {
    private String misionType;

    public Exploration(String name, int Crew, int age, String misionType){
        super(name, Crew, age);
        this.misionType = misionType;
    }

    @Override
    public void startExploration() {
        super.startExploration();
    }
}
