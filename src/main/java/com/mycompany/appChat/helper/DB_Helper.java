/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appchat.helper;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author quykhang
 */
public class DB_Helper {
    public static Connection openConnection() throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
        String connectionUrl = "jdbc:sqlserver://localhost;database=App_Chat;";
        String username = "demo";
        String password = "demo";
        Connection con = DriverManager.getConnection(connectionUrl, username, password);
        return con;
    }
}
