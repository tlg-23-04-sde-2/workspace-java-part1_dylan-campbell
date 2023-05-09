package org.aquarium;

/*
 * This enum is currently not in use, however, I'd like to keep it in this package
 * for the time being, and possibly implement it in the near future.
 *
 * Will probably use to practice java.time package.
 */
public enum OpenHours {
    MONDAY      (10, 5),
    TUESDAY     (10, 5),
    WEDNESDAY   (10, 5),
    THURSDAY    (10, 5),
    FRIDAY      (10, 6),
    SATURDAY    (9, 6),
    SUNDAY      (9, 5);

    private int[] openAndClose = new int[2];

    OpenHours(int openTime, int closeTime) {
        this.openAndClose[0] = openTime;
        this.openAndClose[1] = closeTime;
    }

    public int[] openAndClose() {
        return openAndClose;
    }
}