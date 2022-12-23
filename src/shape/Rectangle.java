package shape;

public class Rectangle extends Fig implements ISides{
    private int l,b;
    public Rectangle(int l, int b)
    {
        this.l=l;
        this.b=b;
    }
    @Override
    public double perimeter() {
        return 2.0*(l+b);

    }

    @Override
    public double area() {
        return l*b;
    }
public double diagonal()
{
    return Math.sqrt(l*l + b*b);
}
    @Override
    public int noOfSides() {
        return 4;
    }
}
