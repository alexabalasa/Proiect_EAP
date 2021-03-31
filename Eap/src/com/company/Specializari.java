package com.company;

public class Specializari {
    protected  String denumire;
    protected String forma_invatamant;

    public Specializari(String denumire, String forma_invatamant){
    this.denumire=denumire;
    this.forma_invatamant=forma_invatamant;
    }

    public String getDenumire() {
        return denumire;
    }

    public String getForma_invatamant() {
        return forma_invatamant;
    }

    public void print(){
        System.out.println("Specializare : " + denumire );
        System.out.println("Forma de invatamant : "+forma_invatamant);
    }
}
