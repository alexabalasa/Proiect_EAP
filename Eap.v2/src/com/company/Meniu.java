package com.company;
import com.company.clase.csv.serii_adaugare;
import com.company.clase.csv.serii_afisare;
import com.company.clase.csv.profesori_adaugare;
import com.company.clase.csv.profesori_afisare;
import com.company.clase.csv.studenti_afisare;
import com.company.clase.csv.specializare_afisare;
import com.company.clase.csv.studenti_adaugare;
import com.company.clase.csv.grupe_afisare;
import com.company.clase.csv.laboratoare_afisare;
import com.company.clase.csv.locatie_afisare;
import com.company.clase.csv.amfiteatre_afisare;
import com.company.clase.csv.materii_afisare;
import java.util.ArrayList;
import java.util.Scanner;

public class Meniu implements ServiciiMeniu {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Specializari> listS = new ArrayList<Specializari>();
    ArrayList<Studenti> list = new ArrayList<Studenti>();
    ArrayList<Profesori> listP = new ArrayList<Profesori>();
    ArrayList<Serii> listSerie = new ArrayList<Serii>();
    ArrayList<Grupe> listG = new ArrayList<Grupe>();
    ArrayList<Laboratoare> listL = new ArrayList<Laboratoare>();
    ArrayList<Locatie> listLo = new ArrayList<Locatie>();
    ArrayList<Amfiteatre> listA = new ArrayList<Amfiteatre>();
    ArrayList<Materii> listM= new ArrayList<Materii>();

    public void meniu() {

        System.out.println("Alege o optiune : ");
        System.out.println(" 1. Afiseaza specializari \n 2. Afiseaza serii \n 3. Adauga serii \n 4. Afiseaza grupe \n 5. Afiseaza studenti \n 6. " +
                "Adauga studenti \n 7. Afiseaza profesori \n 8. Adauga profesori \n 9. Afiseaza materii \n 10. Afiseaza locatia facultatii \n 11. Afiseaza laboraotarele \n 12. Afiseaza amfiteatrele");


        specializare_afisare.citire(listS);
        studenti_afisare.citire(list);
        serii_afisare.citire(listSerie);
        profesori_afisare.citire(listP);
        grupe_afisare.citire(listG);
        laboratoare_afisare.citire(listL);
        locatie_afisare.citire(listLo);
        amfiteatre_afisare.citire(listA);
        materii_afisare.citire(listM);

        char optiune;
        optiune = scanner.next().charAt(0);
        switch (optiune) {
            case 1:
                afisare_specializare();
                break;
            case 2:
                afisare_serii();
                break;
            case 3:
                adauga_serie();
                break;
            case 4:
                afisare_grupe();
                break;
            case 5:
                afisare_studenti();
                break;
            case 6:
                adauga_studenti();
                break;
            case 7:
                afisare_profesori();
                break;
            case 8:
                adauga_profesori();
                break;
            case 9:
                afisare_materii();
                break;
            case 10:
                afisare_locatie();
                break;
            case 11:
                afisare_laboratoare();
                break;
            case 12:
                afisare_amfiteatre();
                break;
        }
    }

    private void adauga_profesori() {
        String nume = "";
        String prenume = "";
        String departament = "";
        String email = "";
        Profesori profesor = new Profesori(nume, prenume, departament, email);
        listP.add(profesor);
        profesori_adaugare.afisare(nume, prenume, departament, email);
    }

    private void adauga_studenti() {
        String nume = "";
        String prenume = "";
        int nr_legitimatie = 0;
        String email = "";
        Studenti student = new Studenti(nume, prenume, nr_legitimatie, email);
        list.add(student);
        studenti_adaugare.afisare(nume, prenume, nr_legitimatie, email);


    }

    private void adauga_serie() {
        String denumire = "";
        String forma_invatamant = "";
        int nr_serie = 0;
        String reprezentant_serie = "";
        int nr_studenti = 0;
        Serii serie = new Serii(denumire, forma_invatamant, nr_serie, reprezentant_serie, nr_studenti);
        listSerie.add(serie);
        serii_adaugare.afisare(denumire, forma_invatamant, nr_serie, reprezentant_serie, nr_studenti);
    }


    @Override
    public void afisare_amfiteatre() {
        for (Amfiteatre a : listA) {
            System.out.println(a.getNume() + " " + a.getEtaj() + " ");
        }
    }
    @Override
    public void afisare_laboratoare() {
        for (Laboratoare lab : listL) {
            System.out.println(lab.getTip() + " " + lab.getEtaj() + " " + lab.getNumar() + " ");
        }
    }
    @Override
    public void afisare_locatie() {
        for (Locatie lo : listLo) {
            System.out.println(lo.getOras() + " " + lo.getStrada() + " " + lo.getNumar() + " " + lo.getContact() + " ");
        }
    }
    @Override
    public void afisare_profesori() {
        for (Profesori p : listP) {
            System.out.println(p.getNume() + " " + p.getPrenume() + " " + p.getDepartament() + " " + p.getMail() + " ");
        }
    }
    @Override
    public void afisare_studenti() {
        for (Studenti s : list) {
            System.out.println(s.getNume() + " " + s.getPrenume() + " " + s.getNr_legitimatie() + " " + s.getEmail() + " ");
        }
    }
    @Override
    public void afisare_materii() {
        for(Materii m:listM){
            System.out.println(m.getNume()+ " " + m.getNr_credite() + " "+ m.getAn_studiu() + " "+ m.getSemestru() + " ");
        }
    }
    @Override
    public void afisare_grupe() {
        for (Grupe gp : listG) {
            System.out.println(gp.getNr_grupa() + " " + gp.getNr_studenti() + " " + gp.getSef_grupa() + " ");
        }
    }
    @Override
    public void afisare_specializare() {
        for (Specializari sp : listS) {
            System.out.println(sp.getDenumire() + " " + sp.getForma_invatamant() + " ");
        }
    }
    @Override
    public void afisare_serii() {
        for (Serii serie : listSerie) {
            System.out.println(serie.getDenumire()+ " " + serie.getForma_invatamant() + " "
                    +serie.getNr_serie()+ " "+ serie.getReprezentant_serie()+" "+ serie.getNr_studenti() + " ");
        }
    }
}


