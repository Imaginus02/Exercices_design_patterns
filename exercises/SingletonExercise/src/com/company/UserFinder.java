package com.company;

import third.party.driver.DatabaseConnection;

import javax.xml.crypto.Data;

public class UserFinder {
    public static void findUsers() {
        DatabaseConnection databaseConnection = DBConnectSingleton.getSingleton().getDatabaseConnection();
        String result = databaseConnection.makeRequest("SELECT * FROM users");
        System.out.println("Users results : ");
        System.out.println(result);
    }
}
