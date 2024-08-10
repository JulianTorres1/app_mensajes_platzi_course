package org.example;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        Conexion conexion = new Conexion();
        try (Connection con = conexion.get_connection()){

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}