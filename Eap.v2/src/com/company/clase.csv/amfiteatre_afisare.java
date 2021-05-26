package com.company.clase.csv;
import com.company.Amfiteatre;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serial;
import java.util.ArrayList;

public class amfiteatre_afisare {
    private final static String patch = "src/com/company/fisiere.csv/Amfiteatre.csv";

    public static void citire(ArrayList<Amfiteatre> amfiteatru) {
        try {


            BufferedReader bf = new BufferedReader(new FileReader(patch));
            String line;
            while (null != (line = bf.readLine())) {
                String[] str = line.split(",");
                amfiteatru.add(new Amfiteatre(  str[1], Integer.parseInt(str[1])));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}