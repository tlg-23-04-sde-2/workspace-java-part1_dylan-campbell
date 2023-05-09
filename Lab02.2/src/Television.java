/*
 * Business class (system class) to model the workings of a television.
 */
class Television {
    // instance variables or fields (properties or attributes)
    String brand; // brand name
    int volume; // current volume

    // business methods or operations
    void turnOn() {
        System.out.println("Turning on your " + brand + " TV to volume " + volume);
    }
    void turnOff() {
        System.out.println("Shutting down... goodbye");
    }
}