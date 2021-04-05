package com.company;

public class Grupe {
    private int nr_grupa;
    private String sef_grupa;
    private int nr_studenti;

    public Grupe(int nr_grupa, String sef_grupa, int nr_studenti) {
        this.nr_grupa = nr_grupa;
        this.sef_grupa = sef_grupa;
        this.nr_studenti = nr_studenti;
    }

    public int getNr_grupa() {
        return nr_grupa;
    }

    public String getSef_grupa() {
        return sef_grupa;
    }

    public int getNr_studenti() {
        return nr_studenti;
    }

    public void print(){
        System.out.println("Aceasta este grupa : " + nr_grupa );
        System.out.println("Seful grupei " + nr_grupa + "este : " +sef_grupa);
        System.out.println("Numarul de studenti din grupa " +nr_grupa + "este : "+nr_studenti);
    }
}
