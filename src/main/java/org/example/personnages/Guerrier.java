package org.example.personnages;

import org.example.Arme;

// Points de vie : 40, Force : 30, Agilité : 12, Intelligence : 12, Arme : Epée ou Hache, Armure : 6
// Dégâts : si arme = épée, (force + agilité) / 2 * arme, sinon si arme = hache, alors force * arme
public class Guerrier extends Vivant {
    private int armure;

    public Guerrier(String nom, int pointsDeVie, int force, int agilite, int intelligence, Arme arme, int armure) {
        super(nom, pointsDeVie, force, agilite, intelligence, arme);
        this.armure = armure;
    }

    @Override
    public int calculDegatsDeBase() {
        if (arme == Arme.EPEE) {
            return (int) Math.round((float) (force + agilite) / 2 * arme.getCoefficient());
        }
        return (int) Math.round(force * arme.getCoefficient());
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
