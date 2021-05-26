package com.company.clase.csv;

import java.io.FileWriter;
import java.io.IOException;
public class serii_adaugare {
    private final static String patch = " src/com/company/fisiere.csv/Serii.csv";

    public static  void afisare(String denumire, String forma_invatamant, int nr_serie, String reprezentant_serie, int nr_studenti ){
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter((patch),true);
            String stringBuilder = denumire +
                    "," +
                    forma_invatamant +
                    "," +
                    nr_serie +
                    "," +
                    reprezentant_serie +
                    ", "
                    +nr_studenti +
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
