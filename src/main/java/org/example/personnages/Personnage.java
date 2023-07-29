package org.example.personnages;

public abstract class Personnage {
    protected String nom;
    protected Integer niveau = 1;
    protected Integer pointsDeVie;
    protected Integer force;
    protected Integer agilite;
    protected Integer intelligence;
    protected Arme arme;

    public Personnage() {}

    public Personnage(String nom, Integer pointsDeVie, Integer force, Integer agilite, Integer intelligence, Arme arme) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
        this.arme = arme;
    }

    public int attaquer(Personnage cible) {
        int degats = calculerDegatsDeBase();
        if (cible instanceof UtilisateurDArmure) {
            degats = degats - ((UtilisateurDArmure) cible).getArmure();
        }
        return degats;
    }

    public abstract int calculerDegatsDeBase();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getNiveau() {
        return niveau;
    }

    public void setNiveau(Integer niveau) {
        this.niveau = niveau;
    }

    public Integer getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(Integer pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public Integer getForce() {
        return force;
    }

    public void setForce(Integer force) {
        this.force = force;
    }

    public Integer getAgilite() {
        return agilite;
    }

    public void setAgilite(Integer agilite) {
        this.agilite = agilite;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
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
        return "personnages.Personnage{" +
                "nom='" + nom + '\'' +
                ", niveau=" + niveau +
                ", pointsDeVie=" + pointsDeVie +
                ", force=" + force +
                ", agilite=" + agilite +
                ", intelligence=" + intelligence +
                ", arme=" + arme +
                '}';
    }
}
