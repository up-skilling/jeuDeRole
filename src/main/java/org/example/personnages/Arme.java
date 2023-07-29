package org.example.personnages;

public enum Arme {
    EPEE(1.5),
    HACHE(2.0),
    ARC(1.0),
    BATON(0.5);

    private final double coefficient;

    Arme(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }
}
