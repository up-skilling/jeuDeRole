package org.example;

import org.example.personnages.Arme;
import org.example.personnages.Guerrier;
import org.example.personnages.Personnage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonnageFactoryTest {

    @Test
    void doitRetournerUnGuerrierQuandUnGuerrierEstFourni() {
        // Given (étant donné les données initiales) => ici on fait toutes les initialisations
        Class<Guerrier> clazz = Guerrier.class;
        String nom = "Xavier";
        Integer niveau = 1;
        Integer pointsDeVie = 15;
        Integer force = 20;
        Integer agilite = 10;
        Integer intelligence = 3;
        Arme arme = Arme.HACHE;
//        Integer armure = 8;

        // When (quand) => ici on fait appel à la fonction qu'on veut tester
        Personnage p = PersonnageFactory.creerPersonnage(clazz, nom);

        // Then (alors) => ici on fait tous les tests (asserts)
        assert p != null;
        assertEquals(nom, p.getNom());
        assertEquals(niveau, p.getNiveau());
        assertEquals(pointsDeVie, p.getPointsDeVie());
        assertEquals(force, p.getForce());
        assertEquals(agilite, p.getForce());
        assertEquals(intelligence, p.getIntelligence());
        assertEquals(arme, p.getArme());
//        assertEquals(armure, p.getArmure());
        assertEquals(Guerrier.class, p.getClass());
    }
}
