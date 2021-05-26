package com.company.clase.BD;
import java.io.IOException;
import com.company.Materii;
import java.sql.*;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Materii_BD {
    static String url = "jdbc:mysql://localhost:3306/eapfmi";
    static  String username = "root";
    static String password = "alexa";

    public static void load_materii(ArrayList<Materii> materie){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "select * from Materii";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {

                String nume=resultSet.getString("nume");

                int nr_credite = resultSet.getInt("nr_credite");
                int an_studiu = resultSet.getInt("an_studiu");
                int semestru = resultSet.getInt("semestru");
                materie.add(new Materii(nume,nr_credite,an_studiu,semestru));
            }
            con.close();
        } catch ( SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void show_materii(){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "select * from Materii";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String nume=resultSet.getString("nume");

                int nr_credite = resultSet.getInt("nr_credite");
                int an_studiu = resultSet.getInt("an_studiu");
                int semestru = resultSet.getInt("semestru");
                System.out.println("Nume: "+nume+ "\nNumarul de credite: "+nr_credite+"\nAnul in care se studiaza: "+an_studiu+"\nSemestrul: "+ semestru);

            }
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void add_materii(Materii materie){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "insert into Materii(nume, nr_credite, an_studiu, semestru) values ('"+materie.getNume()+"' ,"+materie.getNr_credite()+","+materie.getAn_studiu()+","+materie.getSemestru()+")";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.executeUpdate();


            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void update_materii(String nume, int nr_credite){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "update Materii set nr_credite ="+nr_credite+" where nume ='"+nume+"'";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.executeUpdate();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static void delete_materii(ArrayList<Materii> materie, String nume ){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "delete from Materii where nume='"+nume+"'";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.executeUpdate();
            con.close();
            load_materii(materie);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

