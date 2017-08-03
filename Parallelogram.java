
public class Parallelogram extends Trapezoid{
    private double a, b, c, d, e, f, g, h;
    public Parallelogram(){
        a=0;
    }
    public Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        a=x1; b=y1; c=x2; d=y2; e=x3; f=y3; g=x4; h=y4;
        setPoint1(a,b);
        setPoint2(c,d);
        setPoint3(e,f);
        setPoint4(g,h);
    }
    public void getCoord(){
        System.out.println("Coordinates of Parallelogram are: ");
        System.out.println("("+a+", "+b+"), ("+c+", "+d+"), ("+e+", "+f+"), ("+g+", "+h+")");
    }

    public double getHeight(){
        return h-b;
    }
    public double getWidth(){
        return c-a;
    }
    public double getArea(){

        double b = Point.distanceTo(getPoint1(),getPoint2());
        double h = getHeight();
        return b*h;
    }
}

