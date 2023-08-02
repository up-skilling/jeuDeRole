package org.example.personnages;

import org.example.Arme;
import org.example.utils.Util;

// PdV : 34, Force : 12, Agilité : 24, Intelligence : 12, Arme : Arc, Chance : 18
// dégâts = ((force + intelligence) / 2 + agilite) * arme, ou attaque furtive si réussie (agilite * 3, et pas de prise en compte de l'armure)
public class Roublard extends Vivant {
    private int chance;

    public Roublard() {
        super();
    }

    public Roublard(String nom, int pointsDeVie, int force, int agilite, int intelligence, Arme arme, int chance) {
        super(nom, pointsDeVie, force, agilite, intelligence, arme);
        this.chance = chance;
    }

    @Override
    public int attaquer(Personnage cible) {
        if (Util.nombreAleatoire(1, 100) <= chance) {
            return getAgilite() * 3;
        }
        return calculDegatsDeBase();
    }

    @Override
    public int calculDegatsDeBase() {
        return (int) Math.round((double) (getForce() + getIntelligence()) / 2 + getAgilite() * getArme().getCoefficient());
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", chance = " + chance;
    }

}
