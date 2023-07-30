package org.example.personnages;


import org.example.personnages.*;
import org.example.utils.Util;

public class PersonnageFactory {

    public static Personnage creerPersonnage(Class clazz, String nom) {
        if (clazz.equals(Guerrier.class)) {
            return new Guerrier(nom);
        }

        if (clazz.equals(Mage.class)) {
            Mage mage = new Mage();
            mage.setNom(nom);
            System.out.println(mage.getNiveau());
            // PdV : 4d6, Force : 1d6, Agilité : 2d6, Intelligence : 5d6, Mana : 4d6, Arme : Bâton
            mage.setPointsDeVie(Util.nombreAleatoire(4, 24));
            mage.setForce(Util.nombreAleatoire(1, 6));
            mage.setAgilite(Util.nombreAleatoire(2,12));
            mage.setIntelligence(Util.nombreAleatoire(5, 30));
            mage.setArme(Arme.BATON);
            mage.setMana(Util.nombreAleatoire(4, 24));
            return mage;
        }

        if (clazz.equals(Roublard.class)) {
            Roublard roublard = new Roublard();
            roublard.setNom(nom);
            System.out.println(roublard.getNiveau());
            // PdV : 5d6, Force : 2d6, Agilité : 4d6, Intelligence : 2d6, Chance : 3d6, Arme : Arc
            roublard.setPointsDeVie(Util.nombreAleatoire(5, 30));
            roublard.setForce(Util.nombreAleatoire(2, 12));
            roublard.setAgilite(Util.nombreAleatoire(4,24));
            roublard.setIntelligence(Util.nombreAleatoire(2, 12));
            roublard.setArme(Arme.ARC);
            roublard.setChance(Util.nombreAleatoire(3, 18));
            return roublard;
        }

        return null;
    }

}
