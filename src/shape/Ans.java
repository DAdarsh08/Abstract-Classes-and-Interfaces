package shape;

public class Ans {
    public static void main(String[] args) {
        Fig[] ans = {new Rectangle(5, 7), new Square(7)};
        double answer;
        for (Fig a : ans) {
            answer = a.perimeter();
            System.out.println(answer);
            System.out.println(a.area());


        }
        ISides i=new Rectangle(8,9);

        Rectangle rectangle=new Rectangle(8,9);;
        Fig fig=new Rectangle(8,9);;

        System.out.println(  i.noOfSides());
    }
}
