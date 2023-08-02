package org.example.utils;

import java.util.List;

public abstract class Util {

    public static int nombreAleatoire(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    public static <T> T getRandomElement(List<T> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        // Index aléatoire de la liste des types de personnage
        int index = Util.nombreAleatoire(0, list.size() - 1);
        // Récupération et retour, de l'élément correspondant à l'index
        return list.get(index);
    }
}
