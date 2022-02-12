package fr.orsys.kingsley.poker.business;

import java.util.ArrayList;
import java.util.List;

public class Joueur {
	private long id;
	private String pseudo;
	private static float solde = 50f;
	private List<Carte> main = new ArrayList<>();
	private static Long compteur = 0L; // autoboxing
	
	public static float getSolde() {
		return solde;
	}

	public static void setSolde(float solde) {
		Joueur.solde = solde;
	}

	@Override
	public String toString() {
		return "Joueur [id=" + id + ", pseudo=" + pseudo + ", main=" + main + "]";
	}


	public List<Carte> getMain() {
		return main;
	}

	public void setMain(List<Carte> main) {
		this.main = main;
	}

	public Joueur() {
		id = compteur++;
	}
	
	public Joueur(String pseudo) {
		this.pseudo = pseudo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
}
