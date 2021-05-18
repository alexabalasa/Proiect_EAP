package com.company;

import com.company.clase.csv.serii_adaugare;
import com.company.clase.csv.serii_afisare;
import com.company.clase.csv.profesori_adaugare;
import com.company.clase.csv.studenti_afisare;
import com.company.clase.csv.profesori_afisare;
import com.company.clase.csv.specializare_afisare;
import com.company.clase.csv.studenti_adaugare;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Meniu implements ServiciiMeniu {
    Scanner scanner=new Scanner(System.in);
    ArrayList<Specializari> listS = new ArrayList<Specializari>();
    ArrayList<Studenti> list = new ArrayList<Studenti>();
    ArrayList<Profesori> listP= new ArrayList<Profesori>();
    ArrayList<Serii> listSerie = new ArrayList<Serii>();
    public void meniu() 
    {

        System.out.println("Alege o optiune : ");
        System.out.println("1. Afiseaza specializari \n 2. Afiseaza serii \n 3. Adauga serii \n 4. Afiseaza grupe \n 5. Afiseaza studenti \n 6. " +
                "Adauga studenti \n 7. Afiseaza profesori \n 8. Adauga profesori \n 9. Afiseaza materii \n 10. Afiseaza locatia facultatii \n 11. Afiseaza grupele \n 12. Afiseaza laboraotarele \n 13. Afiseaza amfiteatrele"  );
        specializare_afisare.citire(listS);
        studenti_afisare.citire(list);
        serii_afisare.citire(listSerie);
        profesori_afisare.citire(listP);
        char optiune;
        optiune= scanner.next().charAt(0);
        switch (optiune){
            case 1: 
                add_specializare(); // afisare specializari
                break;
            case 2:
                add_serii(); // afisare serii
                break;
            case 3:
                adauga_serie(); // adauga serie ( pe bune add) 
                break;
            case 4:
                add_grupe(); // afisare grupe
                break;
            case 5: 
                add_studenti(); // afisare studenti
                break;
            case 6:
                adauga_studenti(); // adauga studenti ( add pe bune )
                break;
            case 7:
                add_profesori(); // afisare profesori
                break;
            case 8 : 
                adauga_profesori();// adauga profi
                break;
            case 9: add_materii(); // afisare materii
                break;
            case 10:
                add_locatie();// afisare locatie;
                break;
            case 11: 
                add_grupe(); // afisare grupe
                break;
            case 12: 
                add_laboratoare(); // afisare lab;
                break;
            case 13: add_amfiteatre(); // afisare amfi
                break;
        }
        
        
    }

    private void adauga_profesori() {
        String nume="";
        String prenume= "";
        String departament="";
        String email="";
        Profesori profesor= new Profesori(nume, prenume, departament,email);
        listP.add(profesor);
        profesori_adaugare.afisare(nume, prenume, departament,email);
    }

    private void adauga_studenti() {
        String nume="";
        String prenume="";
        int nr_legitimatie=0;
        String email="";
        Studenti student = new Studenti(nume, prenume, nr_legitimatie, email );
        list.add(student);
        studenti_adaugare.afisare(nume, prenume, nr_legitimatie, email);


    }

    private void adauga_serie() {
        String denumire="";
        String forma_invatamant="";
        int nr_serie=0;
        String reprezentant_serie="";
        int nr_studenti=0;
        Serii serie= new Serii(denumire, forma_invatamant, nr_serie, reprezentant_serie, nr_studenti);
        listSerie.add(serie);
        serii_adaugare.afisare(denumire, forma_invatamant, nr_serie, reprezentant_serie, nr_studenti);
    }



    @Override
    public void add_amfiteatre() {
    List<Amfiteatre> listA = new ArrayList<Amfiteatre>();
    Amfiteatre a1= new Amfiteatre("Spiru Haret", 1);
    Amfiteatre a2= new Amfiteatre("Gheoghe Pascu", 2);
    Amfiteatre a3= new Amfiteatre("Lazar Gh", 3);
    listA.add(a1);
    listA.add(a2);
    listA.add(a3);
    for(Amfiteatre a:listA){
        System.out.println(a.getNume() + " " + a.getEtaj() + " ");

    }
    }

    @Override
    public void add_laboratoare() {
        List<Laboratoare> listL= new ArrayList<Laboratoare>();
        Laboratoare lab1= new Laboratoare("informatica",3, 321);
        Laboratoare lab2= new Laboratoare("fizica",2, 211);
        Laboratoare lab3= new Laboratoare("chimie",1, 120);
        listL.add(lab1);
        listL.add(lab2);
        listL.add(lab3);
        for(Laboratoare lab:listL){
            System.out.println(lab.getTip() + " " + lab.getEtaj() + " " + lab.getNumar() + " ");
        }
    }

    @Override
    public void add_locatie() {
    Locatie l1= new Locatie("Bucuresti", "Str Unirii", 2, "031223112");
    Locatie l2= new Locatie("Sibiu", "Str Victoriei", 3, "031231312");
    Locatie l3= new Locatie("Craiova", "Str Unirii", 12, "02218312");
    }

    @Override
    public void add_profesori() {


    for( Profesori p:listP){
        System.out.println(p.getNume() + " " + p.getPrenume() + " "+ p.getDepartament() + " " + p.getMail() + " ");
    }
    }

    @Override
    public void add_studenti() {

        for(Studenti s:list){
            System.out.println(s.getNume() + " " + s.getPrenume() + " " + s.getNr_legitimatie() + " " + s.getEmail() + " ");
        }
        Iterator itr= list.iterator();
        while(itr.hasNext()){
            System.out.println((itr.next()));
        }
    }

    @Override
    public void add_materii() {
        Materii bd = new Materii("Baze de date",5,2,1);
        Materii cn= new Materii("Calcul numeric", 5,1, 2);
        Materii cn2= new Materii("Calculatoare numerice", 4,2 ,2);
        Materii poo= new Materii("Programare orientata pe obiecte", 5,2, 1);

    }

    @Override
    public void add_grupe() {
        List<Grupe> listG = new ArrayList<Grupe>();
        Grupe g1 = new Grupe(1, " Miruna Ana", 25);
        Grupe g2= new Grupe(2, "Codrin Andrei", 23);
        Grupe g3= new Grupe(3, "Brasi Alex", 24);
        Grupe g4= new Grupe(4,"Balasa Alexa", 28);
        listG.add(g1);
        listG.add(g2);
        listG.add(g3);
        listG.add(g4);
        for ( Grupe gp:listG) {
            System.out.println(gp.getNr_grupa() + " " + gp.getNr_studenti() + " " + gp.getSef_grupa() + " ");
        }
    }

    @Override
    public void add_specializare() {
        for(Specializari sp:listS){
            System.out.println(sp.getDenumire() + " " + sp.getForma_invatamant() + " ");
        }
    }

    @Override
    public void add_serii() {
        for (Serii serie : listSerie) {
            serie.print();
        }

    }

}
