package ex3.animaux;

public class Animal {
    private String type;
    private String nom;
    private String comportement;

    public Animal(String type, String nom, String comportement) {
        this.type = type;
        this.nom = nom;
        this.comportement = comportement;
    }

    public String getType() {
        return type;
    }

    public String getNom() {
        return nom;
    }

    public String getComportement() {
        return comportement;
    }
}