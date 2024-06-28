package Lab3.Prob4;

public class Condo extends Property{
    private Address address;
    private int numberOfFloors;
    public Condo(Address address, int numberOfFloors){
        this.address = address;
        this.numberOfFloors = numberOfFloors;
    }
    public Address getAddress() {
        return address;
    }
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    @Override
    public double computeRent(){
        return 400 * numberOfFloors;
    }
}
