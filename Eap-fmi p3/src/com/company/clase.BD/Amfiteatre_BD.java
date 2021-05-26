package com.company.clase.BD;
import java.io.IOException;
import com.company.Amfiteatre;
import java.sql.*;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Amfiteatre_BD {
    static String url = "jdbc:mysql://localhost:3306/eapfmi";
    static  String username = "root";
    static String password = "alexa";

    public static void load_amfiteatre(ArrayList<Amfiteatre> amfiteatru){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "select * from Amfiteatre";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {

                String nume=resultSet.getString("nume");
                int etaj = resultSet.getInt("etaj");

                amfiteatru.add(new Amfiteatre(nume, etaj));
            }
            con.close();
        } catch ( SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void show_amfiteatre(){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "select * from Amfiteatre";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String nume=resultSet.getString("nume");
                int etaj = resultSet.getInt("etaj");

                System.out.println("nume: "+nume+ "\netaj: "+etaj);

            }
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void add_amfiteatre(Amfiteatre amfiteatru){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "insert into Amfiteatre(nume, etaj) values ('"+amfiteatru.getNume()+"' ,"+amfiteatru.getEtaj()+")";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.executeUpdate();


            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



}

