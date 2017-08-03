
public class Rectangle1 extends Parallelogram{
    private double a, b, c, d, e, f, g, h;
    public Rectangle1(){
        a=0;
    }
    public Rectangle1(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        a=x1; b=y1; c=x2; d=y2; e=x3; f=y3; g=x4; h=y4;
        setPoint1(a,b);
        setPoint2(c,d);
        setPoint3(e,f);
        setPoint4(g,h);
    }
    public void getCoord(){
        System.out.println("Coordinates of Rectangle are: ");
        System.out.println("("+a+", "+b+"), ("+c+", "+d+"), ("+e+", "+f+"), ("+g+", "+h+")");
    }

    public double getHeight(){
        return h-b;
    }
    public double getWidth(){
        return Point.distanceTo(getPoint1(),getPoint2());
    }
    public double getArea(){

        double w = getWidth();
        double l = getHeight();
        return w*l;
    }
}

