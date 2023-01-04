package device;

public class PersonalComputer extends Computer {
    public PersonalComputer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on in 5 sec.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off in 5 sec.");
    }
}
