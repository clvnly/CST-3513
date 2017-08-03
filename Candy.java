import java.util.*;
public class Candy {
    int cost,money,choice;
    int cashavailable=75;
    int candy=5,chips=5,gum=5,cookies=5;
    Scanner input = new Scanner(System.in);
    public Candy(){
        cost=1;
    }
    public void displayCash(){
        System.out.println("There is "+cashavailable+" cents in the cash register.");
    }
    public void getCandy(){
        System.out.println(candy+" Candy available.");
        System.out.println("Please deposit 50 cents.");
        cost=50;
        choice=1;
        cashRegister(cost,choice);
    }
    public void getChips(){
        System.out.println(chips+" Chips available.");
        System.out.println("Please deposit 65 cents.");
        cost=65;
        choice=2;
        cashRegister(cost,choice);
    }
    public void getGum(){
        System.out.println(gum+" Gum available.");
        System.out.println("Please deposit 45 cents.");
        cost=45;
        choice=3;
        cashRegister(cost,choice);
    }
    public void getCookies(){
        System.out.println(cookies+" Cookies available.");
        System.out.println("Please deposit 75 cents.");
        cost=75;
        choice=4;
        cashRegister(cost,choice);
    }
    public void cashRegister(int a, int choice){
        int cost = a;
        money = input.nextInt();
        cashavailable+=money;
        cost -= money;
        if (cost > 0) {
            System.out.println("Please deposit another " + cost + " cents.");
            cashRegister(cost,choice);
        }
        else if (cost == 0){
            dispenser(choice);
        }
        else if (cost < 0){
            dispenser(choice);
            if(cashavailable>0){
                cashavailable+=cost;
                System.out.println("Your change is "+Math.abs(cost)+" cents.");
            }else
                System.out.println("Sorry, no change available.");
        }
    }
    public void dispenser(int choice){
        if (choice==1){
            if (candy > 0){
                candy--;
                System.out.println("There are now "+candy+" Candies available.");
                System.out.println("Collect your item at the bottom and enjoy.");
                System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                System.out.println();
            }
            else{
                System.out.println("Sorry, no more Candy available.");
            }
        } else if (choice==2){
            if (chips > 0){
                chips--;
                System.out.println("There are now "+chips+" Chips available.");
                System.out.println("Collect your item at the bottom and enjoy.");
                System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                System.out.println();
            }
            else{
                System.out.println("Sorry, no more Chips available.");
            }
        } else if (choice==3){
            if (gum > 0){
                gum--;
                System.out.println("There are now "+gum+" Gum available.");
                System.out.println("Collect your item at the bottom and enjoy.");
                System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                System.out.println();
            }
            else{
                System.out.println("Sorry, no more Gum available.");
            }
        } else if (choice==4){
            if (cookies > 0){
                cookies--;
                System.out.println("There are now "+cookies+" Cookies available.");
                System.out.println("Collect your item at the bottom and enjoy.");
                System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                System.out.println();
            }
            else{
                System.out.println("Sorry, no more Cookies available.");
            }
        }
    }
}

