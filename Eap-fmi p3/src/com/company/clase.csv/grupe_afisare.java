
package com.company.clase.csv;
import com.company.Grupe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serial;
import java.util.ArrayList;

public class grupe_afisare {
    private final static String patch = "src/com/company/fisiere.csv/Grupe.csv";

    public static void citire(ArrayList<Grupe> grupa) {
        try {


            BufferedReader bf = new BufferedReader(new FileReader(patch));
            String line;
            while (null != (line = bf.readLine())) {
                String[] str = line.split(",");
                grupa.add(new Grupe( Integer.parseInt(str[0]), str[1], Integer.parseInt(str[2])));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}