package com.company;

import third.party.driver.DatabaseConnection;

public class DBConnectSingleton {

    private static DBConnectSingleton instance;
    private DatabaseConnection dbConnection;

    private DBConnectSingleton() {
        this.dbConnection = new DatabaseConnection();
    }

    public static DBConnectSingleton getSingleton() {
        if (instance == null) {
            instance = new DBConnectSingleton();
        }
        return instance;
    }

    public DatabaseConnection getDatabaseConnection() {
        return this.dbConnection;
    }
}
