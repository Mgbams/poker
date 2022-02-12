package fr.orsys.kingsley.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.orsys.kingsley.poker.business.Carte;
import fr.orsys.kingsley.poker.business.Couleur;
import fr.orsys.kingsley.poker.business.Joueur;

public class App {

	public static void main(String[] args) {
		
		List<Carte> cartes = constituerJeu();
		cartes = melangerCartes(cartes);
		afficherCartes(cartes);

		System.out.println();
		
		cartes = trierCartes(cartes);
		afficherCartes(cartes);

		List<Joueur> joueurs = ajouterJoueurs();
		
		distribuerCartes( cartes, joueurs, 5);
	}
	
	/**
	 * Cette méthode affiche la liste de cartes donnée en paramètre
	 * @param cartes la liste de carte à afficher
	 */
	private static void afficherCartes(List<Carte> cartes) {
		// On parcourt la liste de carte donnée en paramètre
		for (Carte carte : cartes) {
			// Par polymorphisme, la méthode toString sur l'objet ArrayList est invoquée
			System.out.print(carte);
		}
		
	}

	/**
	 * Cette méthode constitue un jeu de 52 cartes
	 * @return une liste d'objets de type Carte
	 */
	private static List<Carte> constituerJeu() {
		List<Couleur> couleurs = new ArrayList<>();
		List<Carte> cartes = new ArrayList<>();
		
		couleurs.add(new Couleur("Coeur", "♥"));
		couleurs.add(new Couleur("Trèfle", "♣"));
		couleurs.add(new Couleur("Carreau", "♦"));
		couleurs.add(new Couleur("Pique", "♠"));

		// On parcourt la liste de couleurs pour ajouter 13 cartes à chaque couleur
		for (Couleur couleur : couleurs) {
			for (int i = 2; i <= 14; i++) {
				cartes.add(new Carte(i, couleur));
			}
		}
		
		return cartes;
	}

	private static List<Carte> melangerCartes(List<Carte> cartes) {
		// On mélange les cartes
		Collections.shuffle(cartes);
		return cartes; 
	}
	
	private static List<Joueur> ajouterJoueurs() {
		List<Joueur> joueurs = new ArrayList<>();
		joueurs.add(new Joueur("Kingsley"));
		joueurs.add(new Joueur("Kierran"));
		joueurs.add(new Joueur("Roman"));
		return joueurs;
	}
	

	   private static void distribuerCartes(List<Carte> cartes, List<Joueur> joueurs, int nbCartesADistribuer) {
	        for (int i = 0; i < nbCartesADistribuer; i++) {
	            for (Joueur joueur : joueurs) {
	                joueur.getMain().add(cartes.remove(0));
	                	if(i == 4) {
	                		System.out.println(joueur.getPseudo() + "a " + "main = " + joueur.getMain() + "\n" );
	                	}
	            }    
	            System.out.println();
	        }
	        
	    }
	
	private static List<Carte> trierCartes(List<Carte> cartes) {
		//Collections.sort(cartes, new ComparateurDeCartesSurCouleurPuisValeur());
		return cartes;
	}
}
