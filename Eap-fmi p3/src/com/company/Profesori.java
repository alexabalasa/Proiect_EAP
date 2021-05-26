package com.company;

public class Profesori {
    private String nume;
    private   String prenume;
    private String departament;
    private String mail;

    public Profesori(String nume, String prenume, String departament, String mail) {
        this.nume = nume;
        this.prenume = prenume;
        this.departament = departament;
        this.mail = mail;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getDepartament() {
        return departament;
    }

    public String getMail() {
        return mail;
    }

    public void print(){
        System.out.println("Nume profesor : "+nume);
        System.out.println("Prenume profesor : "+prenume);
        System.out.println("Departamentul din care face parte profesorul : "+departament);
        System.out.println("Mailul de contact : "+mail);
    }
}
