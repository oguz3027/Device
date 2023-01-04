package device;

public  class Laptop extends Computer{
    public Laptop(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turOn() {

    }

    @Override
    public void turOff() {

    }


    @Override
    public void portable() {
        System.out.println(getBrand() + " is portable");

    }



}
