package org.example.personnages;

import org.example.Arme;

public abstract class Vivant extends Personnage {

    public Vivant() {
        super();
    }

    public Vivant(String nom, int pointsDeVie, int force, int agilite, int intelligence, Arme arme) {
        super(nom, pointsDeVie, force, agilite, intelligence, arme);
    }

    @Override
    public int attaquer(Personnage cible) {
        return super.attaquer(cible);
    }

}
