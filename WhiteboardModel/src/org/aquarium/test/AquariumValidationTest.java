package org.aquarium.test;

import org.aquarium.Aquarium;

class AquariumValidationTest {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Testing VALID_GUESTS");
        Aquarium aq1 = new Aquarium("Monterey Bay Aquarium", true, 8316484800L);
        aq1.sellTicket("Child");    // valid
        System.out.println(aq1);
        aq1.sellTicket("Youth");    // valid
        System.out.println(aq1);
        aq1.sellTicket("Adult");    // valid
        System.out.println(aq1);
        aq1.sellTicket("Senior");   // valid
        System.out.println(aq1);
        aq1.sellTicket("Member");   // valid, but no expected increase in revenue
        System.out.println(aq1);
        aq1.sellTicket("Friend");   // NON valid
        System.out.println(aq1);

        System.out.println();
        System.out.println("Testing MAX_GUESTS capacity of 100 guests");
        Aquarium aq2 = new Aquarium();
        System.out.println("Selling 100 tickets."); // valid
        for (int i = 0; i < 100; i++) {
            aq2.sellTicket("Adult");
        }
        System.out.println("Selling 1 additional ticket."); // NON valid
        aq2.sellTicket("Adult");
    }

}