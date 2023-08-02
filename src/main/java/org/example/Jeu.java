package org.example;

import org.example.personnages.*;
import org.example.utils.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jeu {
    List <Class<? extends Personnage>> typesPersonnage = new ArrayList<>(List.of(Guerrier.class, Mage.class, Roublard.class));

    Personnage[] personnages = new Personnage[2];

    public void jouer() {
        Scanner sc = new Scanner(System.in);
        int choix;
        do {
            System.out.println("******** Menu ********");
            System.out.println("1-Voir les caractéristiques des personnages");
            System.out.println("2-Créer les deux personnages qui devront s'affronter");
            System.out.println("3-Faire s'affronter les deux personnages (combat à mort)");
            System.out.println("0-Sortir du programme");
            choix = sc.nextInt();
            sc.nextLine();
            switch(choix) {
                case 1:
                    if (verifierPresencePersonnages()) {
                        afficherPersonnages();
                    } else {
                        System.out.println("Aucun personnage créé.");
                    }
                    System.out.println();
                    break;
                case 2:
                    if (verifierPresencePersonnages()) {
                        System.out.println("Les deux personnages sont déjà créés.");
                    } else {
                        initialiserPersonnages();
                    }
                    System.out.println();
                    break;
                case 3:
                    if (verifierPresencePersonnages()) {
                        combat(personnages[0], personnages[1]);
                        choix = 0;
                    } else {
                        System.out.println("Aucun personnage créé.");
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println();
            }
        } while(choix != 0);
        System.out.println("Au revoir, à bientôt.");
    }

    public boolean verifierPresencePersonnages() {
        if (personnages[0] == null || personnages[1] == null) {
            return false;
        }
        return true;
    }

    public void afficherInfos() {
        System.out.println("Chaque personnage se voit attribuer 100 points répartis dans ses caractéristiques (+ une arme), comme suit :");
        System.out.println();
        System.out.println("Guerrier => PdV : 40, Force : 30, Agilité : 13, Intelligence : 12, Armure : 6, Arme : Epée ou Hache");
        System.out.println("Mage => PdV : 24, Force : 6, Agilité : 12, Intelligence : 30, Mana : 24, Arme : Bâton");
        System.out.println("Roublard => PdV : 30, Force : 12, Agilité : 24, Intelligence : 12, Chance : 18, Arme : Arc");
        System.out.println();
    }

    public void afficherPersonnages() {
        System.out.println(personnages[0]);
        System.out.println(personnages[1]);
    }

    public void initialiserPersonnages() {
        Scanner sc = new Scanner(System.in);
        Class<? extends Personnage> typeDuPremierPersonnage = Util.getRandomElement(typesPersonnage);
        System.out.println("Le premier personnage sera de type " + typeDuPremierPersonnage.getSimpleName());
        System.out.println("Entrez le nom de ce personnage : ");
        String nomDuPremierPersonnage = sc.nextLine();
        personnages[0] = PersonnageFactory.creerPersonnage(typeDuPremierPersonnage, nomDuPremierPersonnage);

        Class<? extends Personnage> typeDuSecondPersonnage = Util.getRandomElement(typesPersonnage);
        System.out.println("Le second personnage sera de type " + typeDuSecondPersonnage.getSimpleName());
        System.out.println("Entrez le nom de ce personnage : ");
        String nomDuSecondPersonnage = sc.nextLine();
        personnages[1] = PersonnageFactory.creerPersonnage(typeDuSecondPersonnage, nomDuSecondPersonnage);

        System.out.println(personnages[0]);
        System.out.println(personnages[1]);
    }

    public void combat(Personnage premierPersonnage, Personnage secondPersonnage) {
        int nbTour = 0;
        int pointsDeVieDuPremierPersonnage;
        int pointsDeVieDuSecondPersonnage;
        System.out.println("Le combat commence !");
        do {
            nbTour++;
            System.out.println("Tour " + nbTour + ':');
            jouerTour(premierPersonnage, secondPersonnage);
            pointsDeVieDuPremierPersonnage = premierPersonnage.getPointsDeVie();
            pointsDeVieDuSecondPersonnage = secondPersonnage.getPointsDeVie();
        } while (pointsDeVieDuPremierPersonnage > 0 && pointsDeVieDuSecondPersonnage > 0);
        System.out.println("Le combat est terminé.");
        if (pointsDeVieDuPremierPersonnage == 0) {
            System.out.println("Le personnage de type " + premierPersonnage.getClass().getSimpleName() + "nommé " + premierPersonnage.getNom() + " remporte le combat.");
        } else {
            System.out.println("Le personnage de type " + secondPersonnage.getClass().getSimpleName() + "nommé " + secondPersonnage.getNom() + " remporte le combat.");
        }
        System.out.println("Fin du jeu.");
    }

    public void jouerTour(Personnage premierPersonnage, Personnage secondPersonnage) {
        // ToDo
    }

}
