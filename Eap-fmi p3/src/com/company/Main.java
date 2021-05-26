package com.company;

import com.company.fisiere.csv.Menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {


        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/eapfmi";
            String username = "root";
            String password = "alexa";

            System.out.println("Connecting database...");

            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                System.out.println("Database connected!");
            } catch (SQLException e) {
                throw new IllegalStateException("Cannot connect the database!", e);
            }

            Menu.getInstance().menu();
        }



}

