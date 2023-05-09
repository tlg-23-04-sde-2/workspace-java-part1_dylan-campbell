/*
 * Business class (system class) to model the workings of a television.
 */
class Television {
    // static variables - shared amongst all instances -------------------------
    // -------------------------------------------------------------------------
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    private static int instanceCount = 0;

    // static methods
    public static int getInstanceCount() {
        return instanceCount;
    }

    // instance variables or fields (properties or attributes)
    private String brand; // brand name
    private int volume; // current volume
    private boolean isMuted; // mute status
    private DisplayType display;

    // constructors ------------------------------------------------------------
    // -------------------------------------------------------------------------
    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    // business methods --------------------------------------------------------
    // -------------------------------------------------------------------------
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + brand + " TV to volume " + volume);
    }
    public void turnOff() {
        System.out.println("Shutting down... goodbye");
    }

    public void mute() {
        // isMuted = !isMuted;
        if (isMuted) {
            isMuted = false;
            System.out.println("Restoring volume to: " + volume);
        }
        else {
            isMuted = true;
            System.out.println("<MUTED>");
        }
    }

    // accessor methods (get/set) ----------------------------------------------
    // -------------------------------------------------------------------------
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.equals("Samsung") || brand.equals("LG") || brand.equals("Sony") || brand.equals("Toshiba")) {
            this.brand = brand;
        }
        else {
            System.out.println("Not a valid input. Valid brands are: Samsung, LG, Sony, Toshiba.");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            if (isMuted) {
                isMuted = false;
            }
            this.volume = volume;
        }
        else {
            System.out.println("Not a valid input. Valid volume range: [" + MIN_VOLUME + ", " + MAX_VOLUME + "].");
        }
    }

    public DisplayType getDisplayType() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    private boolean verifyInternetConnection() {
        return true;
    }

    public String toString() {
        if (isMuted) {
            return "Television: brand=" + getBrand() +
                    ", volume= <MUTED>";
        }
        else {
            return "Television: brand=" + getBrand() +
                    ", volume=" + getVolume();
        }
    }
}