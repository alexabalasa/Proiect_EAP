package com.company.clase.csv;
import com.company.Locatie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serial;
import java.util.ArrayList;

public class locatie_afisare {
    private final static String patch = "src/com/company/fisiere.csv/Locatie.csv";

    public static void citire(ArrayList<Locatie> locatie) {
        try {


            BufferedReader bf = new BufferedReader(new FileReader(patch));
            String line;
            while (null != (line = bf.readLine())) {
                String[] str = line.split(",");
                locatie.add(new Locatie( str[0], str[1], Integer.parseInt(str[2]),str[3]  ));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}