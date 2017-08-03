
public class Rectangle {
    private int length;
    private int width;
    private int area;
    private int perimeter;
    public Rectangle(){
        length=1;
        width=1;
    }
    public void setLength(int len){
        length=len;
        findPerimeter();
        findArea();
    }
    public void setWidth(int wid){
        width=wid;
        findPerimeter();
        findArea();
    }
    public void findPerimeter(){
        perimeter=length+length+width+width;
    }
    public void findArea(){
        area=length*width;
    }
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public int getPerimeter(){
        return perimeter;
    }
    public int getArea(){
        return area;
    }
}
