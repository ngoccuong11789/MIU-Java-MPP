package Lab3.Prob4;

public class Trailer extends Property{
    private Address trailerParkAddress;
    public Trailer(Address trailerParkAddress) {
        this.trailerParkAddress = trailerParkAddress;
    }
    public Address getTrailerParkAddress() {
        return trailerParkAddress;
    }

    @Override
    public double computeRent() {
        rent = 500;
        return rent;
    }

}
