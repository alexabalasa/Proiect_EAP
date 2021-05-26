package com.company.clase.csv;

import java.io.FileWriter;
import java.io.IOException;
public class studenti_adaugare {
    private final static String patch = " src/com/company/fisiere.csv/Studenti.csv";

    public static  void afisare(String nume, String prenume, int nr_legitimatie, String email ){
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter((patch),true);
            String stringBuilder = nume +
                    "," +
                    prenume +
                    "," +
                    nr_legitimatie +
                    "," +
                    email +
                    "\n";
            fileWriter.write(stringBuilder);
            fileWriter.flush();
            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
