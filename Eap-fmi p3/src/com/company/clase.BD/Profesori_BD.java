package com.company.clase.BD;
import java.io.IOException;
import com.company.Profesori;
import java.sql.*;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Profesori_BD {
    static String url = "jdbc:mysql://localhost:3306/eapfmi";
    static  String username = "root";
    static String password = "alexa";

    public static void load_profesori(ArrayList<Profesori> profesor){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "select * from Profesori";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {

                String nume=resultSet.getString("nume");
                String prenume=resultSet.getString("prenume");
                String departament=resultSet.getString("departament");

                String mail= resultSet.getString("mail");
                profesor.add(new Profesori(nume, prenume, departament,mail));
            }
            con.close();
        } catch ( SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void show_profesori(){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "select * from Profesori";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String nume=resultSet.getString("nume");
                String prenume=resultSet.getString("prenume");
                String departament=resultSet.getString("departament");
                String mail= resultSet.getString("mail");

                System.out.println("Nume: "+nume+ "\nPrenume: "+prenume+"\nDepartament: "+departament+"\nmail: "+ mail);

            }
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void add_profesori(Profesori profesor){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "insert into Profesori(nume, prenume,departament, mail) values ('"+profesor.getNume()+"' ,'"+profesor.getPrenume()+"','"+profesor.getDepartament()+"','"+profesor.getMail()+"' )";

            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.executeUpdate();


            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void update_profesori(String mail, String nume, String prenume){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "update Profesori set mail ='"+mail+"'where nume='"+nume+"' and prenume='"+prenume+"'";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.executeUpdate();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static void delete_profesori(ArrayList<Profesori> profesor, String mail){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "delete from Profesori where mail='"+mail+"'";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.executeUpdate();
            con.close();
            load_profesori(profesor);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

