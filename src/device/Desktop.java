package device;

public class Desktop extends Computer{
    public Desktop(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void portable() {

    }

    @Override
    public void turOn() {

    }

    @Override
    public void turOff() {

    }
}
