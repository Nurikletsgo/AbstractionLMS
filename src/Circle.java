public class Circle extends  Shape{

    public Circle( String name,double radius) {
        super (name,radius);
    }

    @Override
    public void getPerimeter() {
        double PI = 3.14;
        double perimeter =  2 * PI * getRadius();
            System.out.println(getName()+" perimeter "+perimeter);
        }
    }

