package com.company;

import com.company.data.PostgresDB;
import com.company.data.interfaces.IDB;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        IDB db = new PostgresDB();
        Connection conn = db.getConnection("delieveryservicedb", "postgres", "0000");
    }
}
