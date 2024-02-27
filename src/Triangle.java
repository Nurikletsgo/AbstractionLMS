public class Triangle extends Shape{
    public Triangle( String name ,double a, double b, double c) {
        super(name,a, b, c);
    }

    @Override
    public void getPerimeter() {
        double perimeter = getA()+getB()+getC();
        System.out.println(getName()+" perimeter "+perimeter);
    }
}
