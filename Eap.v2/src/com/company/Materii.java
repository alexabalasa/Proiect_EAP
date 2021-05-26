package com.company;

public class Materii {
    private String nume;
    private int nr_credite;
    private int an_studiu;
    private int semestru;

    public String getNume() {
        return nume;
    }

    public int getNr_credite() {
        return nr_credite;
    }

    public int getAn_studiu() {
        return an_studiu;
    }

    public int getSemestru() {
        return semestru;
    }

    public Materii(String nume, int nr_credite, int an_studiu, int semestru) {

        this.nume = nume;
        this.nr_credite = nr_credite;
        this.an_studiu = an_studiu;
        this.semestru = semestru;
    }
    public void print(){
        System.out.println("Materia : "+nume);
        System.out.println("Numarul de credite al materiei "+nume +" este : "+nr_credite);
        System.out.println("Anul in care se studiaza materia : " +an_studiu);
        System.out.println("Semestrul in care se studiaza materia : " +semestru );
    }

}
