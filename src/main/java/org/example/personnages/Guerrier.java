package org.example.personnages;


public class Guerrier extends Personnage implements UtilisateurDArmure {
    private int armure;

    public Guerrier() {
        super();
    }

    public Guerrier(String nom, Integer pointsDeVie, Integer force, Integer agilite, Integer intelligence, Arme arme, int armure) {
        super(nom, pointsDeVie, force, agilite, intelligence, arme);
        this.armure = armure;
    }

    // dégâts = force * arme
    @Override
    public int calculerDegatsDeBase() {
        if (arme == Arme.HACHE) {
            return (int) Math.round(force * arme.getCoefficient());
        }
        return (int) Math.round((double) (3 * agilite + force) / 2 * arme.getCoefficient());
    }

    @Override
    public int getArmure() {
        return armure;
    }

    public void setArmure(int armure) {
        this.armure = armure;
    }

    @Override
    public String toString() {
        return "Guerrier : " +
                "Nom = '" + nom + '\'' +
                ", Niveau = " + niveau +
                ", PV = " + pointsDeVie +
                ", F = " + force +
                ", A = " + agilite +
                ", I = " + intelligence +
                ", Arme = " + arme +
                ", Armure = " + armure;
    }
}
