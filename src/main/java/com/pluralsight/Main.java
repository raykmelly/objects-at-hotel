package com.pluralsight;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create some guests
        Guest guest1 = new Guest("John Doe");
        Guest guest2 = new Guest("Jane Doe");

        // Have them interact with the front desk
        FrontDesk frontDesk = new FrontDesk("James Hill");
        String result1 = frontDesk.checkInGuest(guest1,100,"K-100",150);


    }
}