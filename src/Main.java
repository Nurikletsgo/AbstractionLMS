//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*public abstract double getPerimeter()

деген абстракт методун  Shape деген класска кошунуз.

Ал методту ишке ашырган 5 мурастоочу класс тузунуз жана методту ишке ашырыныз*/


        Shape circle = new Circle("Circle",3);
        Shape triangle = new Triangle("Triangle",6, 4, 3);
        Shape rectangle = new Rectangle("Rectangle",2, 4, 2, 4);
        Shape square = new Square("Square",4, 4, 4, 4);
        Shape pentagon = new Pentagon("Pentagon",5, 5, 5, 5, 5);
        Shape hexagon = new Hexagon("Hexagon",3, 3, 3, 3, 3, 3);

       Shape[] shapes = {circle,triangle,rectangle,square,pentagon,hexagon};
       for (Shape shape : shapes ){
          shape.getPerimeter();
       }
    }
}