/*
 * This is a client "main-class", i.e. a class definition with the main() method.
 * It will create a few instances of AlarmClock and give them a basic test-drive.
 */
class AlarmClockClient {

    // starting point or "entry point" for every standalone Java application
    public static void main(String[] args) {
        // create an instance of AlarmClock (an AlarmClock object)
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7);
        clock1.setRepeat(5); // 5 more times, then it gives up

        // create a second instance of AlarmClock
        AlarmClock clock2 = new AlarmClock();
        clock2.setSnoozeInterval(10);

        // create a 3rd AlarmClock object, BUT don't set its properties
        AlarmClock clock3 = new AlarmClock();

        // make them snooze
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();
        System.out.println();

        // show their toString() methods in action
        System.out.println(clock1);
        System.out.println(clock2);
        System.out.println(clock3);
    }
}