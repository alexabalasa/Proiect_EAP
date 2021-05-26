package com.company.clase.csv;

import com.company.Laboratoare;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serial;
import java.util.ArrayList;

public class laboratoare_afisare {
    private final static String patch = "src/com/company/fisiere.csv/Laboratoare.csv";

    public static void citire(ArrayList<Laboratoare> laborator) {
        try {


            BufferedReader bf = new BufferedReader(new FileReader(patch));
            String line;
            while (null != (line = bf.readLine())) {
                String[] str = line.split(",");
                laborator.add(new Laboratoare( str[0], Integer.parseInt(str[1]) ,Integer.parseInt(str[2])  ));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
