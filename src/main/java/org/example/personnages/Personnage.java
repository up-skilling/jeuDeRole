package org.example.personnages;

import org.example.Arme;

public abstract class Personnage {
    protected String nom;
    protected int niveau = 1;
    protected int pointsDeVie;
    protected int force;
    protected int agilite;
    protected int intelligence;
    protected Arme arme;

    public Personnage(String nom, int pointsDeVie, int force, int agilite, int intelligence, Arme arme) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
        this.arme = arme;
    }

    public int attaquer(Personnage cible) {
        int degats = calculDegatsDeBase();
        if (cible instanceof UtilisateurDArmure) {
            degats = degats - ((UtilisateurDArmure) cible).getArmure();
        }
        return degats;
    }

    public abstract int calculDegatsDeBase();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getAgilite() {
        return agilite;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public Arme getArme() {
        return arme;
    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }

    @Override
    public String toString() {
        return nom + " : " +
                "niveau " + niveau +
                ", points de vie = " + pointsDeVie +
                ", force = " + force +
                ", agilite = " + agilite +
                ", intelligence = " + intelligence +
                ", arme = " + arme;
    }

}
