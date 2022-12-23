package company.com;

public class Dhepsi extends TaxableProduct{
    private int quantity;

    public Dhepsi(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public double tax() {
        return quantity * 0.25;
    }
}


