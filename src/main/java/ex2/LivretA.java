package ex2;

/**
 * Représente un livret A.
 */
public class LivretA extends CompteBancaire {

	// Taux de rémunération annuel du livret A
	private double tauxRemuneration;

	/**
	 * Constructeur pour créer un livret A.
	 *
	 * @param solde               Le solde initial du livret A.
	 * @param tauxRemuneration    Le taux de rémunération annuel du livret A.
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0); // Le livret A ne permet pas de découvert
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public void debiterMontant(double montant) {
		if (getSolde() - montant >= 0) {
			setSolde(getSolde() - montant);
		}
	}

	/**
	 * Applique la rémunération annuelle au solde du livret A.
	 */
	public void appliquerRemunerationAnnuelle() {
		setSolde(getSolde() + getSolde() * tauxRemuneration / 100);
	}

	// Getter pour le taux de rémunération
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	// Setter pour le taux de rémunération
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}