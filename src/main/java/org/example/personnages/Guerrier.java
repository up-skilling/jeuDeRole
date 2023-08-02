package org.example.personnages;

import org.example.Arme;

// PdV : 40, Force : 30, Agilité : 12, Intelligence : 12, Arme : Epée ou Hache, Armure : 6
// dégâts : si arme = épée, (force + agilité) / 2 * arme, sinon si arme = hache, alors force * arme
public class Guerrier extends Vivant {
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

    public Guerrier(String nom, int pointsDeVie, int force, int agilite, int intelligence, Arme arme, int armure) {
        super(nom, pointsDeVie, force, agilite, intelligence, arme);
        this.armure = armure;
    }

    @Override
    public int calculDegatsDeBase() {
        if (getArme() == Arme.EPEE) {
            return (int) Math.round((float) (getForce() + getAgilite()) / 2 * getArme().getCoefficient());
        }
        return (int) Math.round(getForce() * getArme().getCoefficient());
    }

    public int getArmure() {
        return armure;
    }

    public void setArmure(int armure) {
        this.armure = armure;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", armure = " + armure;
    }

}
