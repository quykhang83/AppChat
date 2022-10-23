/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appChat.helper;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Duy
 */
public class DB_Helper {
    public static Connection openConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String DB_URL = "jdbc:sqlserver://localhost:1433;database=Duyapp;";
        String USER_NAME = "sa";
        String PASSWORD = "123456";
        Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
        return conn;
    }
}
