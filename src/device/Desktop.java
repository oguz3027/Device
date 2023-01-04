package device;

public class Desktop extends Computer{
    public Desktop(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }


    @Override
    public void turnOn() {
        System.out.println("Turning on in 2 seconds");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off in 2 seconds");
    }
}
