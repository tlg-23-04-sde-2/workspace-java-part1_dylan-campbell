/*
 * Client-side main-class to create a few instances of Television
 * and give them a basic test-drive.
 */
class TelevisionClient {

    public static void main(String[] args) {
        Television tv1 = new Television();
        tv1.brand = "Samsung";
        tv1.volume = 32;

        Television tv2 = new Television();
        tv2.brand = "LG";
        tv2.volume = 20;

        Television tv3 = new Television();

        tv1.turnOn();
        tv2.turnOn();
        tv3.turnOn();

        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();
    }
}