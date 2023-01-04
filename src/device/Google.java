package device;

public class Google extends Phone implements AndroidApps {

    public Google(String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Google", model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {  // comes from Device
        System.out.println("Use the G button");
    }

    @Override
    public void turnOff() {  // comes from Device
        System.out.println("Push the button for 1.2 second");
    }

    @Override
    public void downloadable() {  // comes from Downloadable
        System.out.println("You can also use G Store");
    }
}
