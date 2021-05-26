package com.company;

public class Amfiteatre {
    private String nume;
    private int etaj;

    public Amfiteatre(String nume, int etaj) {
        this.nume = nume;
        this.etaj = etaj;
    }
    public  void  print(){
        System.out.println("Numele amfiteatrului : "+nume);
        System.out.println("Etajul unde gasim amfiteatrul : " +etaj);
    }

    public String getNume() {
        return nume;
    }

    public int getEtaj() {
        return etaj;
    }
}
