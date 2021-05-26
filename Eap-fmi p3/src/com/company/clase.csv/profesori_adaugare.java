package com.company.clase.csv;

import java.io.FileWriter;
import java.io.IOException;
public class profesori_adaugare {
    private final static String patch = "src/com/company/fisiere.csv/Profesori.csv";

    public static  void afisare(String nume, String prenume, String departament, String email ){
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter((patch),true);
            String stringBuilder = nume +
                    "," +
                    prenume +
                    "," +
                    departament +
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
