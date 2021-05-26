package com.company;

public class Laboratoare {
    private String tip;
    private int etaj;
    private int numar;

    public Laboratoare(String tip, int etaj, int numar) {
        this.tip = tip;
        this.etaj = etaj;
        this.numar = numar;
    }

    public String getTip() {
        return tip;
    }

    public int getEtaj() {
        return etaj;
    }

    public int getNumar() {
        return numar;
    }

    public  void print(){
        System.out.println("Materia pentru care este destinat laboratorul : " +tip );
        System.out.println("Etajul unde gasim laboratorul : "+etaj);
        System.out.println("Numarul laboratorului : " +numar);
    }
}
