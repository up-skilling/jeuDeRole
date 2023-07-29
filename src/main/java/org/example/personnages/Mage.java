package org.example.personnages;


public class Mage extends Personnage implements UtilisateurDeMana {
    private int mana;

    public Mage() {
        super();
    }

    public Mage(String nom, Integer pointsDeVie, Integer force, Integer agilite, Integer intelligence, Arme arme, int mana) {
        super(nom, pointsDeVie, force, agilite, intelligence, arme);
        this.mana = mana;
    }

    // dégâts = (intelligence + mana) * arme
    @Override
    public int calculerDegatsDeBase() {
        return (int) Math.round((intelligence + mana) * arme.getCoefficient());
    }

    @Override
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Mage : " +
                "Nom = '" + nom + '\'' +
                ", Niveau = " + niveau +
                ", PV = " + pointsDeVie +
                ", F = " + force +
                ", A = " + agilite +
                ", I = " + intelligence +
                ", Arme = " + arme +
                ", Mana = " + mana;
    }
}
