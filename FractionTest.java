/**
 * Created by Calvin on 9/21/2016.
 */
import java.util.*;
public class FractionTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,d;
        int choice=1;
        int precision;
        System.out.print("Enter Numerator 1: ");
        a = input.nextInt();
        System.out.print("Enter Denominator 1: ");
        b = input.nextInt();
        System.out.print("Enter Numerator 2: ");
        c = input.nextInt();
        System.out.print("Enter Denominator 2: ");
        d = input.nextInt();
        System.out.print("Enter precision: ");
        precision = input.nextInt();
        Fraction fraction1 = new Fraction(a,b);
        Fraction fraction2 = new Fraction(c,d);

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        while(choice>=1) {
            System.out.print("Choice: ");
            choice=input.nextInt();
            if (choice == 1) {
                System.out.print("a + b = " + fraction1.addFraction(fraction2) + " = ");
                System.out.printf("%."+precision+"f",fraction1.addFractionDec(fraction2));
                System.out.println();
            } else if (choice == 2) {
                System.out.print("a - b = " + fraction1.subtractFraction(fraction2) + " = ");
                System.out.printf("%."+precision+"f",fraction1.subtractFractionDec(fraction2));
                System.out.println();
            } else if (choice == 3) {
                System.out.print("a * b = " + fraction1.multiplyByFraction(fraction2) + " = ");
                System.out.printf("%."+precision+"f",fraction1.multiplyByFractionDec(fraction2));
                System.out.println();
            } else if (choice == 4) {
                System.out.print("a / b = " + fraction1.divideByFraction(fraction2) + " = ");
                System.out.printf("%."+precision+"f",fraction1.divideByFractionDec(fraction2));
                System.out.println();
            } else if (choice == 5) {
                System.exit(0);
            }
        }/*
        System.out.println("F1: " + fraction1.getFraction() + " Dec: " + fraction1.getFractionDecimal());
        System.out.println("F2: " + fraction2.getFraction() + " Dec: " + fraction2.getFractionDecimal() + "\n");
        System.out.println("F1 + F2: " + fraction1.addFraction(fraction2));
        System.out.println("F2 + F1: " + fraction2.addFraction(fraction1) + "\n");
        System.out.println("F1 - F2: " + fraction1.subtractFraction(fraction2));
        System.out.println("F2 - F1: " + fraction2.subtractFraction(fraction1) + "\n");
        System.out.println("F1 * F2: " + fraction1.multiplyByFraction(fraction2));
        System.out.println("F2 * F1: " + fraction2.multiplyByFraction(fraction1) + "\n");
        System.out.println("F1 / F2: " + fraction1.divideByFraction(fraction2));
        System.out.println("F2 / F1: " + fraction2.divideByFraction(fraction1));*/
    }
}