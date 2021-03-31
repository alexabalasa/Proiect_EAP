package com.company;

import javax.swing.event.ListDataListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

        public static void main(String[] args) {
            List<Specializari> listS = new ArrayList<Specializari>();
            Specializari mate = new Specializari("Matematica", "IF");
            Specializari info = new Specializari("Informatica", "IF");
            Specializari CTI = new Specializari("Calculatoare si Tehnologia Informatiei", "ID");
            listS.add(mate);
            listS.add(info);
            listS.add(CTI);
            for(Specializari sp:listS){
                System.out.println(sp.getDenumire() + " " + sp.getForma_invatamant() + " ");
            }
            //////////////////////////////////////////////////////////////////////////

            Serii s25 = new Serii( "CTI", "ID", 25, "Popescu Marcel", 100);
            Serii s15 = new Serii( "CTI", "ID", 15, "Mihnea Alex", 100);
            Serii s33 = new Serii( "info", "IF", 33, "Daria Alexa", 300);
            Serii s41 = new Serii( "mate", "IF", 41, "Matei Miruna", 210);

            ////////////////////////////////////////////////////////////////////////////////////
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
            ////////////////////////////////////////////////////////////////////////////////////

            Materii bd = new Materii("Baze de date",5,2,1);
            Materii cn= new Materii("Calcul numeric", 5,1, 2);
            Materii cn2= new Materii("Calculatoare numerice", 4,2 ,2);
            Materii poo= new Materii("Programare orientata pe obiecte", 5,2, 1);


            //////////////////////////////////////////////////////////////////////////
            List<Studenti> list = new ArrayList<Studenti>();
            Studenti s1 = new Studenti("Balasa", "Alexandra", 3,"alexandra.balasa@s.unibuc.ro");
            Studenti s2 = new Studenti("Maticiuc", "Mihai", 30,"mati.mihai@s.unibuc.ro");
            Studenti s3 = new Studenti("Popescu", "Alex", 20,"alex.popescu@s.unibuc.ro");

            list.add(s1);
            list.add(s2);
            list.add(s3);

            for(Studenti s:list){
                System.out.println(s.getNume() + " " + s.getPrenume() + " " + s.getNr_legitimatie() + " " + s.getEmail() + " ");
            }
            Iterator itr= list.iterator();
            while(itr.hasNext()){
                System.out.println((itr.next()));
            }
            //////////////////////////////////////////////////////

            List<Profesori> listP= new ArrayList<Profesori>();
            Profesori p1= new Profesori("Poescu", "Anghel", "matematica", "popescu@yahoo.com");
            Profesori p2= new Profesori("Vasile", "Cornel", "informatica", "vsl@gmai.com");
            listP.add(p1);
            listP.add(p2);

            for( Profesori p:listP){
                System.out.println(p.getNume() + " " + p.getPrenume() + " "+ p.getDepartament() + " " + p.getMail() + " ");
            }
            //////////////////////////////////////////////////////////////////////////

            Locatie l1= new Locatie("Bucuresti", "Str Unirii", 2, "031223112");
            Locatie l2= new Locatie("Sibiu", "Str Victoriei", 3, "031231312");
            Locatie l3= new Locatie("Craiova", "Str Unirii", 12, "02218312");

            /////////////////////////////////////////////////////////////////////////////////////////
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
            /////////////////////////////////////////////////////////////////////////////////////////////////
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

}

