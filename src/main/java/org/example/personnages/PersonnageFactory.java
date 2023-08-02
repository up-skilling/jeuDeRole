package org.example.personnages;

import org.example.Arme;
import org.example.utils.Util;

public class PersonnageFactory {

    public static Personnage creerPersonnage(Class clazz, String nom) {
        // PdV : 40, Force : 30, Agilité : 12, Intelligence : 12, Arme : Epée ou Hache, Armure : 6
        if (clazz.equals(Guerrier.class)) {
            Arme arme;
            if (Util.nombreAleatoire(1, 2) == 1) {
                arme = Arme.EPEE;
            } else {
                arme = Arme.HACHE;
            }
            return new Guerrier(nom, 40, 30, 12, 12, arme, 6);
        }
        // PdV : 28, Force : 6, Agilité : 12, Intelligence : 30, Arme : Bâton, Mana : 24
        if (clazz.equals(Mage.class)) {
            return new Mage(nom,28, 6, 12, 30, Arme.BATON, 24);
        }
        // PdV : 34, Force : 12, Agilité : 24, Intelligence : 12, Arme : Arc, Chance : 18,
        if (clazz.equals(Roublard.class)) {
            return new Roublard(nom, 34, 12, 24, 12, Arme.ARC, 18);
        }
        return null;
    }
}
