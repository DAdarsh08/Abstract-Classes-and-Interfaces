package CalusingAnonymous;

public class Cal {
    public static void main(String[] args) {
        Calculation a= new Calculation() {


            @Override
            public void   add(int a,int b) {
                System.out.println(a+b);

            }

            @Override
            public void subtract() {
                System.out.println(7-9);;

            }
        };
        a.add(6,9);
        a.subtract();
    }
}
