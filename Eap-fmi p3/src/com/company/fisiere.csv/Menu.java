package com.company.fisiere.csv;

import com.company.*;
import com.company.clase.BD.Amfiteatre_BD;
import com.company.clase.BD.Grupe_BD;
import com.company.clase.BD.Laboratoare_BD;
import com.company.clase.BD.Materii_BD;
import com.company.clase.BD.Profesori_BD;
import com.company.clase.BD.Specializari_BD;
import com.company.clase.BD.Studenti_BD;


import java.util.ArrayList;
import java.util.Scanner;
// meniul pentru baza de date
public class Menu {
    private static Menu menu;

    private Menu() {
    }

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        int menu = 0;

        ArrayList<Specializari> listS = new ArrayList<Specializari>();
        ArrayList<Studenti> list = new ArrayList<Studenti>();
        ArrayList<Profesori> listP = new ArrayList<Profesori>();
        ArrayList<Grupe> listG = new ArrayList<Grupe>();
        ArrayList<Laboratoare> listL = new ArrayList<Laboratoare>();
        ArrayList<Amfiteatre> listA = new ArrayList<Amfiteatre>();
        ArrayList<Materii> listM = new ArrayList<Materii>();

        Amfiteatre_BD.load_amfiteatre(listA);
        Studenti_BD.load_studenti(list);
        Specializari_BD.load_specializari(listS);
        Profesori_BD.load_profesori(listP);
        Materii_BD.load_materii(listM);
        Laboratoare_BD.load_laboratoare(listL);
        Grupe_BD.load_grupe(listG);


        while (option >= -1 && option <= 11) {

            if (menu == 0) {
                System.out.println("Buna ziua!\nSelectati o optiune:");
                System.out.println("Pentru a adauga selectati:");
                System.out.println("1. Specializari \n2. Studenti\n3. Profesori\n4. Grupe\n5. Laboratoare\n6. Amfiteatre\n7. Materii");
                System.out.println("10. Exit \n");
            } else if (menu == 1) {
                System.out.println("Meniu Specializari \nSelectati: ");
                System.out.println("1. Add \n2.Delete \n3.Show \n9.Back");
            } else if (menu == 2) {
                System.out.println("Meniu Studenti \nSelectati: ");
                System.out.println("1. Add \n2.Update \n3.Show \n4.Delete \n9.Back");
            } else if (menu == 3) {
                System.out.println("Meniu Profesori \nSelectati: ");
                System.out.println("1. Add \n2.Update \n3.Show \n4.Delete \n9.Back");
            } else if (menu == 4) {
                System.out.println("Meniu Grupe \nSelectati: ");
                System.out.println("1. Add \n2.Show \n3.Delete \n9.Back");
            } else if (menu == 5) {
                System.out.println("Meniu Laboratoare \nSelectati: ");
                System.out.println("1. Add\n2.Show \n9.Back");
            } else if (menu == 6) {
                System.out.println("Meniu Amfiteatre \nSelectati: ");
                System.out.println("1. Add \n2.Show \n9.Back");
            } else if (menu == 7) {
                System.out.println("Meniu Materii \nSelectati: ");
                System.out.println("1. Add \n2.Update \n3.Show \n4.Delete \n9.Back");
            }

            System.out.println("Alegerea dvs: ");
            option = scanner.nextInt();

            switch (menu) {
              case 0 ->
                      {
                          switch (option)
                          {
                              case 1->
                                      {
                                          menu=1;
                                      }
                              case 2->
                                      {
                                          menu=2;
                                      }
                              case 3->
                                      {
                                          menu=3;
                                      }
                              case 4->
                                      {
                                          menu=4;
                                      }
                              case 5->
                                      {
                                          menu=5;
                                      }
                              case 6->
                                      {
                                          menu=6;
                                      }
                              case 7->
                                      {
                                          menu=7;
                                      }
                              case 10 -> { //Exit
                                  System.out.println("La revedere! ");
                                  option = 12;
                              }
                          }
                      }
                case 1 ->//Selectat meniu Specializari
                        {


                            switch (option) {
                                case 1 ->//add
                                        {
                                            System.out.println("Denumire: ");
                                            scanner.skip("\n");
                                            String den = scanner.nextLine();

                                            System.out.println("Forma invatamant: ");
                                            String forma = scanner.nextLine();


                                            Specializari spec = new Specializari(den, forma);
                                            Specializari_BD.add_specializari(spec);

                                            System.out.println("Specializarea a fost adaugata.");
                                        }

                                case 2 ->//delete
                                        {
                                            System.out.println("Introduceti denumirea specializarii pe care doriti sa o modifcati: ");
                                            scanner.skip("\n");
                                            String den = scanner.nextLine();
                                            System.out.println("Introduceti forma de invatamant a specializarii pe care doriti sa o modifcati: ");
                                            String forma = scanner.nextLine();

                                            Specializari_BD.delete_specializare(listS, den, forma);


                                        }
                                case 3 ->//show
                                        {
                                            Specializari_BD.show_specializari();
                                        }
                                case 9 -> {
                                    menu = 0;
                                }

                            }

                        }
                case 2 -> // Selectat meniu student "1. Add \n2.Update \n3.Show \n4.Delete \n9.B
                        { menu = 2;
                            switch (option) {
                                case 1 ->//add
                                        {
                                            System.out.println("Nume: ");
                                            scanner.skip("\n");
                                            String nume = scanner.nextLine();

                                            System.out.println("Prenume: ");
                                            String prenume = scanner.nextLine();

                                            System.out.println("Numar legitimatie: ");
                                            int nr_leg = scanner.nextInt();

                                            System.out.println("E-Mail: ");
                                            String email = scanner.nextLine();


                                            Studenti std = new Studenti(nume, prenume, nr_leg, email);
                                            Studenti_BD.add_studenti(std);

                                            System.out.println("Studentul a fost adaugat.");

                                        }
                                case 2 ->//update
                                        {
                                            System.out.println("Introduceti numarul de legitimatie al studentului pe care doriti sa il modifcati: ");
                                            scanner.skip("\n");
                                            int nr_leg = scanner.nextInt();

                                            System.out.println("Introduceti noul email: ");
                                            String email = scanner.nextLine();

                                            Studenti_BD.update_studenti(nr_leg, email);
                                            System.out.println("Modificarea a fost salvata!");

                                        }
                                case 3 -> // show
                                        {
                                            Studenti_BD.show_studenti();

                                        }
                                case 4 -> // delete
                                        {
                                            System.out.println("Introduceti numarul legimatiei studentului de sters: ");
                                            scanner.skip("\n");
                                            int nr_legitimatie = scanner.nextInt();

                                            Studenti_BD.delete_studenti(list, nr_legitimatie);


                                        }
                                case 9 -> {
                                    menu = 0;
                                }
                            }
                        }
                case 3 -> // Selectat meniu Profesori
                        {
                            switch (option) {
                                case 1 ->//add
                                        {
                                            System.out.println("Nume: ");
                                            scanner.skip("\n");
                                            String nume = scanner.nextLine();

                                            System.out.println("Prenume: ");
                                            String prenume = scanner.nextLine();
                                            System.out.println("Departament: ");
                                            String dep = scanner.nextLine();
                                            System.out.println("mail: ");
                                            String mail = scanner.nextLine();

                                            Profesori prof = new Profesori(nume, prenume, dep, mail);
                                            Profesori_BD.add_profesori(prof);

                                            System.out.println("Profesorul a fost adaugat.");
                                        }
                                case 2 ->//update
                                        {
                                            System.out.println("Introduceti numele : ");
                                            scanner.skip("\n");
                                            String nume = scanner.nextLine();
                                            System.out.println("Introduceti prenumele : ");
                                            String prenume = scanner.nextLine();
                                            System.out.println("Introduceti noul mail: ");
                                            String mail = scanner.nextLine();

                                            Profesori_BD.update_profesori(nume, prenume, mail);
                                            System.out.println("Modificarea a fost salvata!");

                                        }
                                case 3 -> // show
                                        {

                                            Profesori_BD.show_profesori();
                                        }
                                case 4 -> // delete
                                        {
                                            System.out.println("Introduceti mailul profesorului de sters: ");
                                            scanner.skip("\n");
                                            String mail = scanner.nextLine();

                                            Profesori_BD.delete_profesori(listP, mail);


                                        }
                                case 9 -> {
                                    menu = 0;
                                }
                            }
                        }
                case 4 -> //grupe
                        {
                            switch (option) {
                                case 1 ->//add
                                        {
                                            System.out.println("Numarul grupei: ");
                                            scanner.skip("\n");
                                            int nr_grupa = scanner.nextInt();

                                            System.out.println("Seful grupei: ");
                                            String sef = scanner.nextLine();
                                            System.out.println("Numarul studentilor din grupa: ");
                                            int nr_studenti = scanner.nextInt();
                                            Grupe gr = new Grupe(nr_grupa, sef, nr_studenti);
                                            Grupe_BD.add_grupe(gr);

                                            System.out.println("Grupa a fost adaugata.");
                                        }
                                case 2 ->//show
                                        {
                                            Grupe_BD.show_grupe();
                                        }
                                case 3 ->//delete
                                        {
                                            System.out.println("Introduceti numarul grupei de sters: ");
                                            scanner.skip("\n");
                                            int nr_grp = scanner.nextInt();

                                            Grupe_BD.delete_grupe(listG, nr_grp);
                                        }
                                case 9 -> {
                                    menu = 0;
                                }
                            }
                        }
                case 5 ->//laboratoare
                        {
                            switch (option) {
                                case 1 ->//add
                                        {
                                            System.out.println("tip: ");
                                            scanner.skip("\n");
                                            String tip = scanner.nextLine();

                                            System.out.println(" etaj: ");
                                            int etaj = scanner.nextInt();
                                            System.out.println(" numar: ");
                                            int numar = scanner.nextInt();

                                            Laboratoare lab = new Laboratoare(tip, etaj, numar);
                                            Laboratoare_BD.add_laboratoare(lab);

                                            System.out.println("Laboratorul a fost adaugat.");
                                        }
                                case 2 -> // show
                                        {
                                            Laboratoare_BD.show_laboratoare();
                                        }
                                case 9 -> {
                                    menu = 0;
                                }
                            }
                        }
                case 6 ->//amfiteatre
                        {
                            switch (option) {
                                case 1 ->//add
                                        {
                                            System.out.println("nume: ");
                                            scanner.skip("\n");
                                            String nume = scanner.nextLine();

                                            System.out.println(" etaj: ");
                                            int etaj = scanner.nextInt();

                                            Amfiteatre amf = new Amfiteatre(nume, etaj);
                                            Amfiteatre_BD.add_amfiteatre(amf);

                                            System.out.println("Amfiteatrul a fost adaugat.");
                                        }
                                case 2 -> // show
                                        {
                                            Amfiteatre_BD.show_amfiteatre();
                                        }
                                case 9 -> {
                                    menu = 0;
                                }
                            }
                        }
                            case 7 -> // materii
                                    {
                                        switch (option) {
                                            case 1 ->//add
                                                    {
                                                        System.out.println("nume: ");
                                                        scanner.skip("\n");
                                                        String nume = scanner.nextLine();

                                                        System.out.println("numarul de credite: ");
                                                        int nr_credite = scanner.nextInt();
                                                        System.out.println("Anul in care se studiaza : ");
                                                        int an_studiu = scanner.nextInt();
                                                        System.out.println("semestrul: ");
                                                        int semestru = scanner.nextInt();


                                                        Materii materie = new Materii(nume, nr_credite, an_studiu, semestru);
                                                        Materii_BD.add_materii(materie);

                                                        System.out.println("Materia a fost adaugata.");
                                                    }
                                            case 2 -> // update
                                                    {
                                                        System.out.println("Introduceti numele : ");
                                                        scanner.skip("\n");
                                                        String nume = scanner.nextLine();
                                                        System.out.println("Introduceti numarul de credite : ");
                                                        int nr_credite = scanner.nextInt();


                                                        Materii_BD.update_materii(nume, nr_credite);
                                                        System.out.println("Modificarea a fost salvata!");
                                                    }
                                            case 3 -> //show
                                                    {
                                                        Materii_BD.show_materii();
                                                    }
                                            case 4 ->//delete
                                                    {
                                                        System.out.println("Introduceti numele materiei de sters: ");
                                                        scanner.skip("\n");
                                                        String nume = scanner.nextLine();

                                                        Materii_BD.delete_materii(listM, nume);
                                                    }
                                            case 9 -> {
                                                menu = 0;
                                            }
                                        }
                                    }

                        }
            }
        }
    }
