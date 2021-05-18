package com.company.clase.csv;

import com.company.Serii;
import com.company.Specializari;
import com.company.Studenti;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serial;
import java.util.ArrayList;

public class serii_afisare {
    private final static String patch = "src/com/company/fisiere.csv/Serii.csv";

    public static void citire(ArrayList<Serii> serie) {
        try {


            BufferedReader bf = new BufferedReader(new FileReader(patch));
            String line;
            while (null != (line = bf.readLine())) {
                String[] str = line.split(",");
                serie.add(new Serii(str[0],str[1], Integer.parseInt(str[2]), str[3], Integer.parseInt(str[4]) ));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

