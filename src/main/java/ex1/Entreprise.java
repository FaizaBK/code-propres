package ex1;

import java.util.Date;

//classe entreprise avec ses informations de base.

public class Entreprise {

	// Le numéro SIRET de l'entreprise.
	public int siret;

	// Le nom de l'entreprise.
	public String nom;

	// L'adresse de l'entreprise.
	public String adresse;

	// La date de création de l'entreprise.
	public Date dateCreation;

	// Le capital maximum autorisé pour l'entreprise.
	public static final int CAPITAL_MAX = 3000000;

	/**
	 * Affiche le statut de l'entreprise.
	 * Cette méthode pourrait afficher des informations sur l'état actuel de l'entreprise.
	 */
	public void afficherStatut() {
		// Implémentation à ajouter
	}
}