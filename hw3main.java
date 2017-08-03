/**
 * Created by Calvin on 9/21/2016.
 */
import java.util.*;
public class hw3main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,d;
        int choice=1;
        int precision;
        //enter values
        System.out.print("Enter Numerator 1: ");
        a = input.nextInt();
        System.out.print("Enter Denominator 1: ");
        b = input.nextInt();
        if(b==0){ //denominator check
            System.err.print("Denominator cannot be zero");
            System.exit(0);
        }
        System.out.print("Enter Numerator 2: ");
        c = input.nextInt();
        System.out.print("Enter Denominator 2: ");
        d = input.nextInt();
        if(d==0){ //denominator check
            System.err.print("Denominator cannot be zero");
            System.exit(0);
        }
        System.out.print("Enter precision: ");
        precision = input.nextInt();
        Rational fraction1 = new Rational(a,b);
        Rational fraction2 = new Rational(c,d);

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");

        //Choices & object calls
        while(choice>=1) {
            System.out.print("Choice: ");
            choice=input.nextInt();
            if (choice == 1) {
                System.out.print("a + b = " + fraction1.add(c,d) + " = ");
                System.out.printf("%."+precision+"f",fraction1.addDec(c,d));
                System.out.println();
            } else if (choice == 2) {
                System.out.print("a - b = " + fraction1.subtract(c,d) + " = ");
                System.out.printf("%."+precision+"f",fraction1.subtractDec(c,d));
                System.out.println();
            } else if (choice == 3) {
                System.out.print("a * b = " + fraction1.multiply(c,d) + " = ");
                System.out.printf("%."+precision+"f",fraction1.multiplyDec(c,d));
                System.out.println();
            } else if (choice == 4) {
                System.out.print("a / b = " + fraction1.divide(c,d) + " = ");
                System.out.printf("%."+precision+"f",fraction1.divideDec(c,d));
                System.out.println();
            } else if (choice == 5) {
                System.exit(0);
            }
        }
    }
}

