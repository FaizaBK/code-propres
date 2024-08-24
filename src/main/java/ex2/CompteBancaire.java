package ex2;

/**
 * Représente un compte bancaire de base.
 */
public abstract class CompteBancaire {

	// Solde du compte
	private double solde;

	// Découvert autorisé pour les comptes courants
	private double decouvert;

	// Constructeur
	public CompteBancaire(double solde, double decouvert) {
		this.solde = solde;
		this.decouvert = decouvert;
	}

	// Méthode pour ajouter un montant au solde
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	// Méthode abstraite pour débiter un montant
	public abstract void debiterMontant(double montant);

	// Getter pour le solde
	public double getSolde() {
		return solde;
	}

	// Setter pour le solde
	public void setSolde(double solde) {
		this.solde = solde;
	}

	// Getter pour le découvert
	public double getDecouvert() {
		return decouvert;
	}

	// Setter pour le découvert
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
}