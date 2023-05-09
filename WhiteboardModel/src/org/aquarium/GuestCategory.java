package org.aquarium;

public enum GuestCategory {
    CHILD   (44.95),
    YOUTH   (49.95),
    ADULT   (59.95),
    SENIOR  (49.95),
    MEMBER  (0.0);

    private double ticketPrice;

    GuestCategory(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public double ticketPrice() {
        return ticketPrice;
    }
}