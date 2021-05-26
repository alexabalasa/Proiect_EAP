package com.company.clase.csv;

import com.company.Studenti;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class studenti_afisare {
    private final static String patch = "src/com/company/fisiere.csv/Studenti.csv";

    public static void citire(ArrayList<Studenti> student) {
        try {


            BufferedReader bf = new BufferedReader(new FileReader(patch));
            String line;
            while (null != (line = bf.readLine())) {
                String[] str = line.split(",");
                student.add(new Studenti(str[0], str[1], Integer.parseInt(str[2]), str[3]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

