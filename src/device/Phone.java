package device;

public abstract class Phone extends Device{

    // constructor---
    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }
    // buradaki methodlar non abstract olsun dediği için instance (!) method yaptım kontorl edin lütfen
    public long call(long phoneNumber){
        return phoneNumber;
    }
    public long text(long phoneNumber){
        return phoneNumber;
    }


}
