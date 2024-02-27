public class Rectangle extends Shape{
    public Rectangle(String name ,double a, double b,double c,double d) {
        super(name,a, b,c,d);



    }

    @Override
    public void getPerimeter() {
        double perimeter =  getA()*2+getA()*2;
            System.out.println(getName()+" perimeter "+perimeter);

    }
}


