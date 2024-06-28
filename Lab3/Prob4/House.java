package Lab3.Prob4;

public class House extends Property{
    private Address address;
    private double lotSize;
    public House(double lotSize, Address address) {
        this.lotSize = lotSize;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public double computeRent() {
        return 0.1 * lotSize;
    }

}
