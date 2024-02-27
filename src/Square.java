public class Square extends Shape{
    public Square(String name,double a, double b, double c,double d) {
        super(name,a, b,c,d);
    }

    @Override
    public void getPerimeter() {
        double perimeter = getA()*4;
        System.out.println(getName()+" perimeter "+perimeter);
    }
}
