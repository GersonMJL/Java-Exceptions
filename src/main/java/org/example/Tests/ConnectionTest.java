package org.example.Tests;

import org.example.Connection;

public class ConnectionTest {
    public static void main(String[] args) {

        try (Connection connection = new Connection()) {
            connection.readData();
        } catch (IllegalStateException ex) {
            System.out.println("Connection error.");
        }

        //------------------------

//        Connection connection = null;
//        try {
//            connection = new Connection();
//            connection.readData();
//        } catch (IllegalStateException ex) {
//            System.out.println("Connection error.");
//        } finally {
//            connection.close();
//        }
    }
}
