public class Trapezoid extends Quadrilateral {
    private double a, b, c, d, e, f, g, h;
    public Trapezoid(){
        a=0;
    }
    public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        a=x1; b=y1; c=x2; d=y2; e=x3; f=y3; g=x4; h=y4;
        setPoint1(a,b);
        setPoint2(c,d);
        setPoint3(e,f);
        setPoint4(g,h);

    }
    public void getCoord(){
        System.out.println("Coordinates of Trapezoid are: ");
        System.out.println("("+a+", "+b+"), ("+c+", "+d+"), ("+e+", "+f+"), ("+g+", "+h+")");
    }

    public double getHeight(){
        return h-b;
    }
    public double getArea(){
        double a = Point.distanceTo(getPoint4(),getPoint3());
        double b = Point.distanceTo(getPoint1(),getPoint2());
        double h = getHeight();
        return ((a+b)/2)*h;
    }
}
