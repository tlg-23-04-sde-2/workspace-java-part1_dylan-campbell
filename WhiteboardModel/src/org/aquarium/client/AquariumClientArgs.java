package org.aquarium.client;

import org.aquarium.Aquarium;

// TODO: currently, if user submits a name like "Monterey Bay Aquarium", this class will read that as 3 arguments vice 1
// TODO: create system that parses the elements of args to construct a string with spaces
class AquariumClientArgs {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("This class requires passing in 3 parameters: Aquarium Name, Nonprofit Status, and Phone Contact Number.");
            return;
        } else {
            Boolean isNonprofit = Boolean.parseBoolean(args[1]);
            Long phoneContact = Long.parseLong(args[2]);
            Aquarium aq1 = new Aquarium(args[0], isNonprofit, phoneContact);
            System.out.println(aq1);
        }
    }
}