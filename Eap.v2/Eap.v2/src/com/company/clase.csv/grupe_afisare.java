package com.company.clase.csv;

import com.company.Profesori;
import com.company.Serii;
import com.company.Specializari;
import com.company.Studenti;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serial;
import java.util.ArrayList;

public class profesori_afisare {
    private final static String patch = "src/com/company/fisiere.csv/Profesori.csv";

    public static void citire(ArrayList<Profesori> profesor) {
        try {


            BufferedReader bf = new BufferedReader(new FileReader(patch));
            String line;
            while (null != (line = bf.readLine())) {
                String[] str = line.split(",");
                profesor.add(new Profesori( str[0], str[1], str[2], str[3] ));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

