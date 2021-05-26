package com.company.clase.BD;
import java.io.IOException;
import com.company.Specializari;
import java.sql.*;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Specializari_BD {
    static String url = "jdbc:mysql://localhost:3306/eapfmi";
    static  String username = "root";
    static String password = "alexa";

    public static void load_specializari(ArrayList<Specializari> specializare){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "select * from Specializari";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {

                String denumire=resultSet.getString("denumire");
                String forma_invatamant=resultSet.getString("forma_invatamant");

                specializare.add(new Specializari(denumire, forma_invatamant));
            }
            con.close();
        } catch ( SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void show_specializari(){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "select * from Specializari";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String denumire=resultSet.getString("denumire");
                String forma_invatamant=resultSet.getString("forma_invatamant");

                System.out.println("Denumire: "+denumire+ "\nForma de invatamant: "+forma_invatamant);

            }
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void add_specializari(Specializari specializare){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "insert into Specializari(denumire, forma_invatamant) values ( '"+specializare.getDenumire()+"','" + specializare.getForma_invatamant()+"')";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.executeUpdate();


            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public static void delete_specializare(ArrayList<Specializari> specializare,String denumire,String forma_invatamant ){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "delete from Specializari where denumire='"+denumire +"' and forma_invatamant='"+forma_invatamant+"'";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.executeUpdate();
            con.close();
            load_specializari(specializare);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

