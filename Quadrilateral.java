
public class Quadrilateral {
    private Point point1, point2, point3, point4;
    private double a, b, c, d, e, f, g, h;

    public Quadrilateral(){
        a=0; b=0;
    }
    public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        a=x1; b=y1; c=x2; d=y2; e=x3; f=y3; g=x4; h=y4;
        setPoint1(a,b);
        setPoint2(c,d);
        setPoint3(e,f);
        setPoint4(g,h);
    }

    public void setPoint1(double x, double y){
        point1 = new Point(x,y);
    }
    public void setPoint2(double x, double y){
        point2 = new Point(x,y);
    }
    public void setPoint3(double x, double y){
        point3 = new Point(x,y);
    }
    public void setPoint4(double x, double y){
        point4 = new Point(x,y);
    }
    public Point getPoint1(){
        return point1;
    }
    public Point getPoint2(){
        return point2;
    }
    public Point getPoint3(){
        return point3;
    }
    public Point getPoint4(){
        return point4;
    }
    public void getCoord(){
        System.out.println("Coordinates of Quadrilateral are: ");
        System.out.println("("+a+", "+b+"), ("+c+", "+d+"), ("+e+", "+f+"), ("+g+", "+h+")");
    }
}
