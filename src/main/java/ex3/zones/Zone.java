package ex3.zones;

import ex3.animaux.Animal;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone {
    private List<Animal> animaux = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animaux.add(animal);
    }

    public void afficherListeAnimaux() {
        for (Animal animal : animaux) {
            System.out.println(animal.getNom());
        }
    }

    public int compterAnimaux() {
        return animaux.size();
    }

    public abstract double calculerKgsNourritureParJour();
}