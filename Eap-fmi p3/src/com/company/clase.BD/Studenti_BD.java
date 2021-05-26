package com.company.clase.BD;
import java.io.IOException;
import com.company.Studenti;
import java.sql.*;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Studenti_BD {
    static String url = "jdbc:mysql://localhost:3306/eapfmi";
    static  String username = "root";
    static String password = "alexa";

    public static void load_studenti(ArrayList<Studenti> student){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "select * from Studenti";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {

                String nume=resultSet.getString("nume");
                String prenume=resultSet.getString("prenume");
                int nr_legitimatie = resultSet.getInt("nr_legitimatie");
                String email= resultSet.getString("email");
                student.add(new Studenti(nume, prenume, nr_legitimatie,email));
            }
            con.close();
        } catch ( SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void show_studenti(){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "select * from Studenti";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String nume=resultSet.getString("nume");
                String prenume=resultSet.getString("prenume");
                int nr_legitimatie = resultSet.getInt("nr_legitimatie");
                String email= resultSet.getString("email");
                System.out.println("Nume: "+nume+ "\nPrenume: "+prenume+"\nNumar legitimatie: "+nr_legitimatie+"\nEmail: "+ email);

            }
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void add_studenti(Studenti student){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "insert into Studenti(nume, prenume,nr_legitimatie, email) values ('"+student.getNume()+"' ,'"+student.getPrenume()+"',"+student.getNr_legitimatie()+",'"+student.getEmail()+"' )";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.executeUpdate();


                    con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void update_studenti(int nr_legitimatie, String email){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "update Studenti set email ='"+email+"' where nr_legitimatie ="+nr_legitimatie+"";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.executeUpdate();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static void delete_studenti(ArrayList<Studenti> student, int nr_legitimatie ){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "delete from Studenti where nr_legitimatie="+nr_legitimatie ;
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.executeUpdate();
            con.close();
            load_studenti(student);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

