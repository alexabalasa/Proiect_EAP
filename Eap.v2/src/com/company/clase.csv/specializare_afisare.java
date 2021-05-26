package com.company.clase.csv;

import com.company.Specializari;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class specializare_afisare {
    private final static String patch = "src/com/company/fisiere.csv/Specializari (1).csv";

    public static void citire(ArrayList<Specializari> specializare) {
        try {


            BufferedReader bf = new BufferedReader(new FileReader(patch));
            String line;
            while (null != (line = bf.readLine())) {
                String[] str = line.split(",");
                specializare.add(new Specializari(str[0], str[1]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

