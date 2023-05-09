/*
 * Class definition to model the workings of an alarm clock.
 * This is called a "business class" or "system class".
 * This class definition does NOT have a main() method - most classes don't.
 */
class AlarmClock {
    // properties or attributes - called "instance variables" or "fields" in Java
    private int snoozeInterval = 5; // the default value when client doesn't specify one
    private int repeat = 1; // default value when client doesn't specify



    // business methods - these perform "business tasks" or operations
    public void snooze() {
        System.out.println("Snoozing " + snoozeInterval + " minutes.");
    }

    // accessor methods (get/set) methods - provide "controlled access" to object fields
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    // TODO: business constraint - must be between [1, 20] inclusive
    public void setSnoozeInterval(int snoozeInterval) {
        this.snoozeInterval = snoozeInterval;
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public String toString() {
        return "AlarmClock: snoozeInterval=" + getSnoozeInterval() +
                ", repeat=" + getRepeat();
    }
}