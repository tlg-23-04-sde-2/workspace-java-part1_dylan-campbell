package org.aquarium;

// TODO: get rid of decimal spots beyond tenths place in dailyRevenue (don't care about fractions of a penny)
// TODO: add dashes/dots to phoneContact when it prints out, commas to dailyRevenue if needed

/*
 * Class definition of a (museum) Aquarium object.
 * Business / System class. Does not contain main() method.
 */
public class Aquarium {
    // static variables --------------------------------------------------------
    public static final int MAX_GUESTS = 100;

    private static boolean isValidGuest(String guest) {
        boolean isValid = false;

        for (GuestCategory validGuest : GuestCategory.values()) {
            if (validGuest.toString().equalsIgnoreCase(guest)) {
                isValid = true;
                break;
            }
        }

        return isValid;
    }

    // instance variables ------------------------------------------------------
    private String name;
    private boolean isNonprofit;
    private long phoneContact;
    private boolean isOpen;
    private Integer currentGuestCount;  // constraint: <= MAX_GUESTS
                                        // using Wrapper class to differentiate:
                                        //  0 = no guests currently
                                        //  null = no guests today at all
    private double dailyRevenue;

    // constructors ------------------------------------------------------------
    public Aquarium() {
    }

    public Aquarium(String name) {
        this();             // delegate to no-arg ctor for instance count
        setName(name);
    }

    public Aquarium(String name, boolean isNonprofit) {
        this(name);                 // delegate to other ctor above for name
        setNonprofit(isNonprofit);  // handle nonprofit status by delegating to setter
    }

    public Aquarium(String name, boolean isNonprofit, long phoneContact) {
        this(name, isNonprofit);
        setPhoneContact(phoneContact);
    }

    // business methods --------------------------------------------------------
    public void openAquarium() {
        isOpen = true;
        System.out.println("Opening the " + name + ".");
    }

    // constraint: must be an element of String[] VALID_GUESTS, cannot exceed MAX_GUESTS
    public void sellTicket(String guest) {
        if(isValidGuest(guest)) {
            // currentGuestCount defaults to null at the start of the day, so check for null first to avoid
            //  "NullPointerException" when we have to compare currentGuestCount against MAX_GUESTS
            if (currentGuestCount == null) {
                System.out.println("Welcome to the " + name + "! We hope you enjoy your visit.");
                GuestCategory guestToAdd = GuestCategory.valueOf(guest.toUpperCase());
                currentGuestCount = 1;
                dailyRevenue = dailyRevenue + guestToAdd.ticketPrice();
            } else if (currentGuestCount < MAX_GUESTS) {
                System.out.println("Welcome to the " + name + "! We hope you enjoy your visit.");
                GuestCategory guestToAdd = GuestCategory.valueOf(guest.toUpperCase());
                currentGuestCount++;
                dailyRevenue = dailyRevenue + guestToAdd.ticketPrice();
            } else {
                System.out.println("Cannot sell ticket: maximum guest capacity per regulation is: " + MAX_GUESTS);
            }
        } else {
            System.out.println("Invalid guest category: " + guest + ". Valid categories are:");
            for (GuestCategory validGuest : GuestCategory.values()) {
                String upperCaseGuest = validGuest.toString();
                String fixedCaseGuest = upperCaseGuest.substring(0,1) + upperCaseGuest.substring(1).toLowerCase();
                System.out.println(fixedCaseGuest);
            }
        }
    }

    public void guestLeaves() {
        currentGuestCount--;
        System.out.println("Thank you for visiting the " + name + ", have a nice day!");
    }

    public void conductTour() {
        if (isOpen) {
            System.out.println("The aquarium will now be conducting a guided tour. " +
                    "All interested parties are asked to meet at the Aquarium Gift Shop now.");
        }
    }

    public void feedFish() {
        if (isOpen) {
            System.out.println("The aquarium will now be feeding the wildlife inside the \"Open Sea\" exhibit. " +
                    "All interested parties are asked to make their way there now.");
        }
    }

    public void cleanTanks() {
        if (isOpen) {
            System.out.println("The aquarium will now be cleaning the tanks of our \"Kelp Forest\" exhibit. " +
                    "All interested parties are asked to make their way there now.");
        }
    }

    public void closeAquarium() {
        isOpen = false;
        System.out.println("Closing the " + name + ".");
    }

    // accessor methods --------------------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getNonprofit() {
        return isNonprofit;
    }

    public void setNonprofit(boolean isNonprofit) {
        this.isNonprofit = isNonprofit;
    }

    public long getPhoneContact() {
        return phoneContact;
    }

    public void setPhoneContact(long phoneContact) {
        this.phoneContact = phoneContact;
    }

    // no setter for currentGuestCount - will be handled by sellTicket() and guestLeaves()
    public Integer getCurrentGuestCount() {
        return currentGuestCount;
    }

    // no setter for dailyRevenue - will be handled by sellTicket()
    public double getDailyRevenue() {
        return dailyRevenue;
    }

    @Override
    public String toString() {
        return "org.aquarium.Aquarium" +
                ": name=" + getName() +
                ", isNonprofit=" + getNonprofit() +
                ", phoneContact=" + getPhoneContact() +
                ", currentGuestCount=" + getCurrentGuestCount() +
                ", dailyRevenue=" + getDailyRevenue();
    }
}