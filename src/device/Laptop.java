package device;

public  class Laptop extends Computer{
    public Laptop(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off");
    }

}
