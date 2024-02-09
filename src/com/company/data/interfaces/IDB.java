package com.company.data.interfaces;

import java.sql.Connection;

public interface IDB {
    Connection getConnection(String dbname, String user, String pass);
}
