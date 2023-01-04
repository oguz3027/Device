package device;

public abstract class Phone extends Device{
    private long phoneNumber;


    // getter and setter
    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {

        this.phoneNumber = phoneNumber;
    }
    // constructor
    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton,long phoneNumber) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
        this.phoneNumber=phoneNumber;
    }
    // buradaki methodlar non abstract olsun dediği için instance (!) method yaptım kontorl edin lütfen
    public long call(long phoneNumber){
        return phoneNumber;
    }
    public long text(long phoneNumber){
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Phone{" +
                super.toString()+
                "phoneNumber=" + phoneNumber +
                '}';
    }
}
