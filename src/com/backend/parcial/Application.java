package com.backend.parcial;

import java.sql.Connection;
import java.sql.DriverManager;

public class Application {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:~/prueba2345;INIT=RUNSCRIPT FROM 'create.sql'", "123", "123");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }
}