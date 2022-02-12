package fr.orsys.kingsley.poker.business;

public class Couleur {
	// Attribut(s) de la classe
	// Qu'est-ce qui définit une couleur ?
	private Long id;
	private String nom;
	private String symbole;
	private static Long compteur = 0L; // autoboxing

	// Constructeur par défaut (sans paramètre)
	public Couleur() {
		this("Coeur", "♥");
		id = ++compteur;
	}

	/**
	 * Constructeur
	 * @param nom de la couleur à ajouter
	 * @param valeur de la couleur à ajouter
	 */
	public Couleur(String nom, String symbole) {
		this.nom = nom;
		this.symbole =  symbole;
	}

	public String getSymbole() {
		return symbole;
	}

	public void setValeur(String symbole) {
		this.symbole =  symbole;
	}

	public static Long getCompteur() {
		return compteur;
	}

	public static void setCompteur(Long compteur) {
		Couleur.compteur = compteur;
	}

	// Getter and setter

	public String getNom() {
		return nom;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return symbole;
	}

	
	
}
