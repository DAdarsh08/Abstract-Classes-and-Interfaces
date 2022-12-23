package company.com;

public class Dhepsi {
    private int quantity;

    public Dhepsi(int quantity) {
        this.quantity = quantity;
    }

    public double tax() {
        return quantity * 0.25;
    }
}


