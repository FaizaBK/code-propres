package ex4;

import java.util.Date;


public class Pret {

	// Montant du prêt
	private double montant;

	// Taux d'intérêt du prêt
	private double tauxInteret;

	// Date de début du prêt
	private Date dateDebut;

	// Durée du prêt en mois
	private int dureeMois;

	// Constructeur principal qui initialise tous les attributs
	public Pret(double montant, double tauxInteret, Date dateDebut, int dureeMois) {
		this.montant = montant;
		this.tauxInteret = tauxInteret;
		this.dateDebut = dateDebut;
		this.dureeMois = dureeMois;
	}

	// Constructeur avec dateDebut par défaut (aujourd'hui)
	public Pret(double montant, double tauxInteret, int dureeMois) {
		this(montant, tauxInteret, new Date(), dureeMois);
	}

	// Constructeur avec tauxInteret par défaut (exemple : 1.5%)
	public Pret(double montant, Date dateDebut, int dureeMois) {
		this(montant, 1.5, dateDebut, dureeMois);
	}

	// Constructeur avec dateDebut et tauxInteret par défaut
	public Pret(double montant, int dureeMois) {
		this(montant, 1.5, new Date(), dureeMois);
	}

	// Getters et setters pour accéder et modifier les attributs

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public double getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public int getDureeMois() {
		return dureeMois;
	}

	public void setDureeMois(int dureeMois) {
		this.dureeMois = dureeMois;
	}
}