package org.example.personnages;

import org.example.Arme;

// Points de vie : 28, Force : 6, Agilité : 12, Intelligence : 30, Arme : Bâton, Mana : 24
// Dégâts : (intelligence + mana) * arme
public class Mage extends Vivant {
    private Integer mana;

    public Mage() {
        super();
    }

    public Mage(String nom, int pointsDeVie, int force, int agilite, int intelligence, Arme arme, int mana) {
        super(nom, pointsDeVie, force, agilite, intelligence, arme);
        this.mana = mana;
    }

    @Override
    public int calculDegatsDeBase() {
        return (int) Math.round((getIntelligence() + getMana()) * getArme().getCoefficient());
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", mana = " + mana;
    }

}
