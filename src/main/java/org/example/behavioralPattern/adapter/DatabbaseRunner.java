package org.example.behavioralPattern.adapter;

public class DatabbaseRunner {
    public static void main(String[] args) {
        Database database = new JavaToDatabaseAdapter();
        database.insert();
        database.select();
        database.update();
        database.remove();
    }
}
