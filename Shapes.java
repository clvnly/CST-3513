
public class Shapes {
    public static void main (String[] args){
        Quadrilateral q = new Quadrilateral(1.1,1.2,6.6,2.8,6.2,9.9,2.2,7.4);
        Trapezoid t = new Trapezoid(0,0,10,0,8,5,3.3,5);
        Parallelogram p = new Parallelogram(5,5,11,5,12,20,6,20);
        Rectangle1 r = new Rectangle1(17,14,30,14,0,28,17,28);
        Square s = new Square(4,0,8,0,8,4,4,4);

        q.getCoord();
        t.getCoord();
        System.out.println("Height is: "+t.getHeight());
        System.out.println("Area is: "+t.getArea());
        p.getCoord();
        System.out.println("Width is: "+p.getWidth());
        System.out.println("Height is: "+p.getHeight());
        System.out.println("Area is: "+p.getArea());
        r.getCoord();
        System.out.println("Width is: "+r.getWidth());
        System.out.println("Height is: "+r.getHeight());
        System.out.println("Area is: "+r.getArea());
        s.getCoord();
        System.out.println("Side is: "+s.getWidth());
        System.out.println("Area is: "+s.getArea());
    }
}
