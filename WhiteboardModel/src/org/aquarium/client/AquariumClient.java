package org.aquarium.client;

import org.aquarium.Aquarium;

/*
 * This is a client Main Class, a class definition with a main() method.
 */
class AquariumClient {

    // starting point or "entry point" for every standalone Java application
    public static void main(String[] args) {
        System.out.println();
        Aquarium aq1 = new Aquarium("Monterey Bay Aquarium");
        System.out.println(aq1);
        aq1.setNonprofit(true);
        aq1.setPhoneContact(8316484800L);
        System.out.println(aq1);
        aq1.openAquarium();
        aq1.sellTicket("Child");
        aq1.sellTicket("Adult");
        aq1.sellTicket("Senior");
        aq1.guestLeaves();
        aq1.closeAquarium();
        System.out.println(aq1);

        System.out.println();
        Aquarium aq2 = new Aquarium("National Aquarium", true, 4105763800L);
        System.out.println(aq2);
        aq2.openAquarium();
        aq2.conductTour();
        aq2.feedFish();
        aq2.cleanTanks();
        aq2.closeAquarium();
    }
}