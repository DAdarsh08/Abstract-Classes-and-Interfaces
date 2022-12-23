package company.com;


public class TaxableShop {
    public static void main(String[] args) {
        Dhesus[] dhesuses = {new Dhesus(10), new Dhesus(5)};
        Dhepsi[] dhepsis = {new Dhepsi(2), new Dhepsi(4)};
        double totaltax = 0;
        for (Dhesus dhesus : dhesuses)
            totaltax += dhesus.tax();
        for (Dhepsi dhepsi : dhepsis)
            totaltax += dhepsi.tax();
        System.out.println(totaltax);

    }
}