package com.company.clase.BD;
import java.io.IOException;
import com.company.Grupe;
import java.sql.*;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Grupe_BD {
    static String url = "jdbc:mysql://localhost:3306/eapfmi";
    static  String username = "root";
    static String password = "alexa";

    public static void load_grupe(ArrayList<Grupe> grupa){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "select * from Grupe";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int nr_grupa = resultSet.getInt("nr_grupa");
                String sef_grupa=resultSet.getString("sef_grupa");
                int nr_studenti = resultSet.getInt("nr_studenti");

                grupa.add(new Grupe(nr_grupa, sef_grupa,nr_studenti));
            }
            con.close();
        } catch ( SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void show_grupe(){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "select * from Grupe";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int nr_grupa = resultSet.getInt("nr_grupa");
                String sef_grupa=resultSet.getString("sef_grupa");
                int nr_studenti = resultSet.getInt("nr_studenti");
                System.out.println("Numar grupa: "+nr_grupa+ "\nSeful grupei: "+sef_grupa+ "\nNumarul studentilor:"+nr_studenti);

            }
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void add_grupe(Grupe grupa){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "insert into Grupe(nr_grupa, sef_grupa, nr_studenti) values ("+grupa.getNr_grupa()+" ,'" + grupa.getSef_grupa()+"' , "+grupa.getNr_studenti()+")";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.executeUpdate();


            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public static void delete_grupe(ArrayList<Grupe> grupa,int nr_grupa ){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "delete from Grupe where nr_grupa="+nr_grupa ;
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.executeUpdate();
            con.close();
            load_grupe(grupa);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

