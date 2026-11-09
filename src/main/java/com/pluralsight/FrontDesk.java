package com.pluralsight;

import java.util.HashMap;

public class FrontDesk {
    // Instance variables
    private String clerk;
    private HashMap<Integer, String> occupiedRooms = new HashMap<>();

    // Constructor
    public FrontDesk(String clerk) {
        this.clerk = clerk;
    }

    // Methods
    public String checkInGuest(Guest guest, int room, String key, double roomPrice) {
        // Charges guest for room fee and checks them in
        if (occupiedRooms.containsKey(room)) {
            return "Room " + room + " is already occupied.";
        }
        guest.setKey(key);
        guest.addToReceipt("Room fee",roomPrice);
        return clerk + " has checked in " + guest.getName();
    }

    // Getters / setters
    public String getClerk() {
        return clerk;
    }

    public void setClerk(String clerk) {
        this.clerk = clerk;
    }
}
