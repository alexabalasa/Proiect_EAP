package com.company;

public class Locatie {
    private String oras;
    private String strada;
    private int numar;
    private String contact;

    public String getOras() {
        return oras;
    }

    public String getStrada() {
        return strada;
    }

    public int getNumar() {
        return numar;
    }

    public String getContact() {
        return contact;
    }

    public Locatie(String oras, String strada, int numar, String contact) {
        this.oras = oras;
        this.strada = strada;
        this.numar = numar;
        this.contact = contact;
    }

    public void print(){
        System.out.println("FMI din orasul : "+oras);
        System.out.println("Strada : "+strada);
        System.out.println("Numarul strazii : "+numar);
        System.out.println("Numar telefon : "+contact);
    }
}

