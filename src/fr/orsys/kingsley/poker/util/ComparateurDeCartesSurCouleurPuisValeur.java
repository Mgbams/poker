package fr.orsys.kingsley.poker.util;

import java.util.Comparator;

import fr.orsys.kingsley.poker.business.Carte;

public class ComparateurDeCartesSurCouleurPuisValeur implements Comparator<Carte>{

    @Override
    public int compare(Carte carte1, Carte carte2) {
        if (carte1.getCouleur().getId().equals(carte2.getCouleur().getId())) {
            // Les cartes sont de la m�me couleur on compare leur valeur respective
            if (carte1.getValeur() < carte2.getValeur()) {
                return -1;
            } else if (carte1.getValeur() == carte2.getValeur()) {
                return 0;
            } else {
                return 1;
            }
        } else if (carte1.getCouleur().getId() > carte2.getCouleur().getId()) {
            return 1;
        } else {
            return -1;
        }
    }

}

