package fr.esgi.jeux_dmitri.business.enumeration;

public enum ENiveau {
    CP("CP"),
    CE1("CE1"),
    CE2("CE2"),
    CM1("CM1"),
    CM2("CM2");

    private final String nom;

    ENiveau(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}