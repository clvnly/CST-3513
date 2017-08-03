import java.util.*;
public class CandyMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 1;
        Candy machine = new Candy();
        System.out.println("*** Welcome to Shelly's Candy Shop ***");
        System.out.println("1 for Candy");
        System.out.println("2 for Chips");
        System.out.println("3 for Gum");
        System.out.println("4 for Cookies");
        System.out.println("9 to exit");

        //Choices & object calls
        while (choice >= 1) {
            machine.displayCash();
            System.out.print("Choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                machine.getCandy();
            } else if (choice == 2) {
                machine.getChips();
            } else if (choice == 3) {
                machine.getGum();
            } else if (choice == 4) {
                machine.getCookies();
            } else if (choice == 9) {
                System.exit(0);
            }
        }
    }
}
