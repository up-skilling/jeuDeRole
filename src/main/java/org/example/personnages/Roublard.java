package org.example.personnages;


import org.example.utils.Util;

public class Roublard extends Personnage implements UtilisateurDeChance {

    private int chance;

    public Roublard() {
        super();
    }

    public Roublard(String nom, Integer pointsDeVie, Integer force, Integer agilite, Integer intelligence, Arme arme, int chance) {
        super(nom, pointsDeVie, force, agilite, intelligence, arme);
        this.chance = chance;
    }

    @Override
    public int attaquer(Personnage cible) {
        if (Util.nombreAleatoire(1, 100) <= chance) {
            return agilite * 3;
        }
        return super.attaquer(cible);
    }

    // dégâts = ((force + intelligence) / 2 + agilite) * arme, ou attaque furtive si réussie
    @Override
    public int calculerDegatsDeBase() {
        return (int) Math.round(((double) (force + intelligence)) / 2 + agilite * arme.getCoefficient());
    }

    @Override
    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    @Override
    public String toString() {
        return "Roublard : " +
                "Nom = '" + nom + '\'' +
                ", Niveau = " + niveau +
                ", PV = " + pointsDeVie +
                ", F = " + force +
                ", A = " + agilite +
                ", I = " + intelligence +
                ", Arme = " + arme +
                ", Chance = " + chance;
    }
}
