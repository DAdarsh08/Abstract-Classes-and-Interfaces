package company.com;


public class TaxableShop {
    public static void main(String[] args) {
//        new TaxableProduct();
        TaxableProduct[] products = {new Dhepsi(2), new Dhepsi(4), new Dhesus(10), new Dhesus(5)};
        double totaltax = 0;
        for (TaxableProduct product : products)
            totaltax += product.tax();
        System.out.println(totaltax);

    }
}