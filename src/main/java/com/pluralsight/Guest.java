package com.pluralsight;

import java.util.HashMap;

public class Guest {
    // Instance variables
    public String name;
    public int room;
    public String key;
    HashMap<String, Double> receipt = new HashMap<>();

    // Construction
    public Guest(String name, int room, String key, HashMap<String, Double> receipt) {
        this.name = name;
        this.room = room;
        this.key = key;
        this.receipt = receipt;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public HashMap<String, Double> getReceipt() {
        return receipt;
    }

    public void setReceipt(HashMap<String, Double> receipt) {
        this.receipt = receipt;
    }
}
