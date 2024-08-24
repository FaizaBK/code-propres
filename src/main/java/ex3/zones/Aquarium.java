package ex3.zones;

public class Aquarium extends Zone {

    @Override
    public double calculerKgsNourritureParJour() {
        return compterAnimaux() * 0.2;
    }
}