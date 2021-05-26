package com.company.clase.BD;
import java.io.IOException;
import com.company.Laboratoare;
import java.sql.*;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Laboratoare_BD {
    static String url = "jdbc:mysql://localhost:3306/eapfmi";
    static  String username = "root";
    static String password = "alexa";

    public static void load_laboratoare(ArrayList<Laboratoare> laborator){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "select * from Laboratoare";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {

                String tip=resultSet.getString("tip");

                int etaj = resultSet.getInt("etaj");
                int numar = resultSet.getInt("numar");

                laborator.add(new Laboratoare(tip, etaj,numar));
            }
            con.close();
        } catch ( SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void show_laboratoare(){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "select * from Laboratoare";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String tip=resultSet.getString("tip");

                int etaj = resultSet.getInt("etaj");
                int numar = resultSet.getInt("numar");
                System.out.println("tip: "+tip+ "\netaj: "+etaj+"\nnumar: "+numar);

            }
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void add_laboratoare(Laboratoare laboratoare){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "insert into Laoratoare(tip,etaj,numar) values ('"+laboratoare.getTip()+"' ,"+laboratoare.getEtaj()+","+laboratoare.getNumar()+")";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.executeUpdate();


            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



}

