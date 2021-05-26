package com.company;

public class Serii extends Specializari {
    private int nr_serie;
    private String reprezentant_serie;
    private int nr_studenti;

    public Serii(String denumire, String forma_invatamant, int nr_serie, String reprezentant_serie, int nr_studenti) {
        super(denumire, forma_invatamant);
        this.nr_serie = nr_serie;
        this.reprezentant_serie = reprezentant_serie;
        this.nr_studenti = nr_studenti;
    }

    public int getNr_serie() {
        return nr_serie;
    }

    public String getReprezentant_serie() {
        return reprezentant_serie;
    }

    public int getNr_studenti() {
        return nr_studenti;
    }

    public void print(){
        System.out.println("Seria cu numarul:" + nr_serie);
        System.out.println("Reprezentantul seriei " +nr_serie +" : " +reprezentant_serie );
        System.out.println("Numarul studentilor din serie : " + nr_studenti);
    }
}

