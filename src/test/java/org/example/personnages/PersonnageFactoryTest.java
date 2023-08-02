package org.example.personnages;

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
        int pointsDeVie = 40;
        int force = 30;
        int agilite = 12;
        int intelligence = 12;
        int armure = 6;

        // When (quand) => ici on fait appel à la fonction qu'on veut tester
        Personnage p = PersonnageFactory.creerPersonnage(clazz, nom);

        // Then (alors) => ici on fait tous les tests (asserts)
        assertNotNull(p);
        assertEquals(nom, p.getNom());
        assertEquals(1, p.getNiveau());
        assertEquals(pointsDeVie, p.getPointsDeVie());
        assertEquals(force, p.getForce());
        assertEquals(agilite, p.getAgilite());
        assertEquals(intelligence, p.getIntelligence());
        assertEquals(armure,((Guerrier) p).getArmure());
        assertTrue(verificationDArme(p.getArme()));
    }
}
