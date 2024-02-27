public class Pentagon extends Shape{


    public Pentagon(String name,double a, double b, double c, double d, double i) {
        super(name,a, b, c, d, i);
    }

    @Override
    public void getPerimeter() {
        double perimeter = getA()*5;
        System.out.println(getName()+" perimeter "+perimeter);
    }
    }

