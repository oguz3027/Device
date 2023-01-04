package device;

public class Iphone extends Phone implements Downloadable,AppleApps{


    public Iphone(String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Iphone", model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() { // comes from Device
        System.out.println("Use the finger print feature");
    }

    @Override
    public void turnOff() { // comes from Device
        System.out.println("Push the button for 1 second");
    }

    @Override
    public void downloadApp() {  // comes from Downloadable
        System.out.println("You cn use Play Store");
    }
}
/*
7. Create the following sub classes of Phone and add any extra methods that are needed:

				1. Iphone :
						extends Phone class and implements Downloadable & AppleApps interfaces

				2. Samsung:
						extends Phone class and implements Downloadable & AndroidApps interfaces

				4. Google:
						extends Phone class and implements Downloadable & AndroidApps interfaces
 */