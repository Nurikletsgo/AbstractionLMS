public abstract class Shape {
    private String name;
    private double a;
    private double b;
    private double c;
    private double d;
    private double i;
    private double f;
    private double radius;


    public Shape(String name,double a, double b, double c, double d, double i, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.i = i;
        this.f = f;
        this.name = name;
    }

    public Shape( String name ,double a, double b, double c, double d, double i) {
       this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.i = i;
    }

    public Shape(String name ,double a, double b, double c, double d) {
       this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Shape(String name,double a, double b, double c) {
       this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public Shape( String name,double a, double b) {
    }

    public Shape(String name,double radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public abstract void getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "a=" + a +
                ", b=" + b +
                ", radius=" + radius +
                ", PI=" + Math.PI +
                '}';
    }
}
