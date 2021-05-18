package com.company;

import java.util.Date;

public class Studenti  {
    private String nume;
    private String prenume;
    private int nr_legitimatie;
    private String email;

    public Studenti(String nume, String prenume, int nr_legitimatie, String email) {
        this.nume = nume;
        this.prenume = prenume;
        this.nr_legitimatie = nr_legitimatie;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getNr_legitimatie() {
        return nr_legitimatie;
    }

    public String getEmail() {
        return email;
    }

    public  void print(){
        System.out.println("Numele si prenumele studentului : " +nume+" " +prenume);
        System.out.println("Numarul legitimatiei : "+nr_legitimatie);
        System.out.println("Emailul studentului : " +email);
    }

}
