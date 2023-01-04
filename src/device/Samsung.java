package device;

public class Samsung extends Phone implements AndroidApps{
    public Samsung( String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Samsung", model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {  // comes from Device
        System.out.println("Use the side button");
    }

    @Override
    public void turnOff() {  // comes from Device
        System.out.println("Push the button for 1.1 second");
    }

    @Override
    public void downloadable() {  // comes from Downloadable
        System.out.println("You can also use Play Store");
    }
}
