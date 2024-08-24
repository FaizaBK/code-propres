package ex3.zoo;

import ex3.animaux.Animal;
import ex3.zones.Aquarium;
import ex3.zones.ZoneCarnivore;
import ex3.zones.FermeReptile;
import ex3.zones.SavaneAfricaine;

public class Zoo {

	private String nom;
	private SavaneAfricaine savaneAfricaine = new SavaneAfricaine();
	private ZoneCarnivore zoneCarnivore = new ZoneCarnivore();
	private FermeReptile fermeReptile = new FermeReptile();
	private Aquarium aquarium = new Aquarium();

	public Zoo(String nom) {
		this.nom = nom;
	}

	public void addAnimal(Animal animal) {
		switch (animal.getType()) {
			case "MAMMIFERE":
				if ("CARNIVORE".equals(animal.getComportement())) {
					zoneCarnivore.addAnimal(animal);
				} else {
					savaneAfricaine.addAnimal(animal);
				}
				break;
			case "REPTILE":
				fermeReptile.addAnimal(animal);
				break;
			case "POISSON":
				aquarium.addAnimal(animal);
				break;
			default:
				throw new IllegalArgumentException("Type d'animal non supporté: " + animal.getType());
		}
	}

	public void afficherListeAnimaux() {
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}