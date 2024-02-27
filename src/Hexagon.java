public class Hexagon extends Shape{
    public Hexagon(String name,double a, double b, double c, double d, double i, double f) {
        super(name,a, b, c, d, i, f);
    }

    @Override
    public void getPerimeter() {
        double perimeter = getA()*6;
        System.out.println(getName()+" perimeter "+perimeter);
    }
}
