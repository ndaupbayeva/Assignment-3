package com.company.data;

import com.company.data.interfaces.IDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class PostgresDB implements IDB {

    @Override
    public Connection getConnection() {
        String connectionUrl = "jdbc:postgresql://localhost:5432/delieverydb";
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(connectionUrl, "postgres", "0000");
            System.out.println("Connection Established");
            return con;
        } catch (Exception e) {
            System.out.println("failed to connect to postgres: " + e.getMessage());
            return null;
        }
    }
}
