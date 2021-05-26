package com.company.clase.csv;
import com.company.Materii;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serial;
import java.util.ArrayList;

public class materii_afisare {
    private final static String patch = "src/com/company/fisiere.csv/Materii.csv";

    public static void citire(ArrayList<Materii> materie) {
        try {


            BufferedReader bf = new BufferedReader(new FileReader(patch));
            String line;
            while (null != (line = bf.readLine())) {
                String[] str = line.split(",");
                materie.add(new Materii( str[0], Integer.parseInt(str[1]),Integer.parseInt(str[2]),Integer.parseInt(str[3])  ));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}