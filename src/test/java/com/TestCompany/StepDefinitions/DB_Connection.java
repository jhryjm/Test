package com.TestCompany.StepDefinitions;

import io.cucumber.java.After;

import java.sql.*;
import java.util.ArrayList;

public class DB_Connection {
    public static void main(String[] args) throws SQLException {

        String connectionStr = "jdbc:oracle:thin:@54.167.105.114:1521:XE";
        String username = "hr";
        String password = "hr";

        Connection connection = DriverManager.getConnection(connectionStr, username,password);

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT FIRST_NAME, LAST_NAME FROM EMPLOYEES");



        ArrayList<String> Results1 = new ArrayList<String>();

//        while(resultSet.next()){
//            Results1.add(resultSet.getString("FIRST_NAME"));
//            Results1.add(resultSet.getString("LAST_NAME"));
//
//
//        }
        while(resultSet.next()){
            if(resultSet.getString("first_name").equals("Ellen")){
                System.out.println(resultSet.getString("first_name"));
                System.out.println(resultSet.getString("last_name"));
                System.out.println(resultSet.getString("EMAIL"));
                System.out.println(resultSet.getString("SALARY"));
            }

        }

        System.out.println(Results1.toString());

/*
        System.out.println(resultSet.getString(2));
        System.out.println(resultSet.getString("REGION_ID"));
        System.out.println(resultSet.getString(2));
        System.out.println(resultSet.getString("REGION_NAME"));
*/


        resultSet.close();
        statement.close();
        connection.close();

        System.out.println("GOD BLESS EUROPE");


    }

}
