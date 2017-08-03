import java.util.*;
public class RectangleMain {

    public static void main(String[] args) {
        int choice;
        Rectangle attributes = new Rectangle();

        Scanner input = new Scanner(System.in);
        System.out.println("1. Set Length");
        System.out.println("2. Set Width");
        System.out.println("3. Exit");
        System.out.print("Choice: ");
        choice= input.nextInt();

        if(choice==1){
            System.out.println("Enter Length: ");
            int len=input.nextInt();
            attributes.setLength(len);
            System.out.println("Length: "+attributes.getLength());
            System.out.println("Width: "+attributes.getWidth());
            System.out.println("Perimeter: "+attributes.getPerimeter());
            System.out.println("Area: "+attributes.getArea());
        }
        else if(choice==2){
            System.out.println("Enter Width: ");
            int wid=input.nextInt();
            attributes.setWidth(wid);
            System.out.println("Length: "+attributes.getLength());
            System.out.println("Width: "+attributes.getWidth());
            System.out.println("Perimeter: "+attributes.getPerimeter());
            System.out.println("Area: "+attributes.getArea());
        }
        else if(choice==3){
            System.exit(0);
        }

    }

}
