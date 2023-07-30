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

        // When (quand) => ici on fait appel à la fonction qu'on veut tester
        Personnage p = PersonnageFactory.creerPersonnage(clazz, nom);

        // Then (alors) => ici on fait tous les tests (asserts)
        assertNotNull(p);
        assertEquals(Guerrier.class, p.getClass());
        assertEquals(nom, p.getNom());
        assertEquals(1, p.getNiveau());
        assertEquals(Guerrier.POINT_DE_VIE, p.getPointsDeVie());
        assertEquals(Guerrier.FORCE, p.getForce());
        assertEquals(Guerrier.AGILITE, p.getAgilite());
        assertEquals(Guerrier.INTELLIGENCE, p.getIntelligence());
        assertEquals(Guerrier.ARMURE, ((Guerrier) p).getArmure());
        assertEquals(Guerrier.ARME, p.getArme());
    }
}
