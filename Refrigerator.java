public class Refrigerator extends Appliance {
    private int cubicFeet;
    private double price;

    public Refrigerator(String serialNumber, double price, int cubicFeet) {
        super(serialNumber);
        this.price = price;
        this.cubicFeet = cubicFeet;
    }

    @Override
    public String toString() {
        return "Appliance Type: Refrigerator. Serial=" + getSerialNumber() + ". Price=$" + price + ". Cubic Feet=" + cubicFeet + ".";
    }
}
