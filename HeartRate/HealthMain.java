package HeartRate;

import java.util.Scanner;

public class HealthMain {
    public static void main(String[] args){
        String f_name,l_name;
        int dob_m, dob_d, dob_y, h, w;
        Scanner input = new Scanner(System.in);
        HeartRates rate = new HeartRates();
        HealthProfile profile = new HealthProfile();

        System.out.println("Enter your Date of Birth: ");
        System.out.println("Enter month: ");
        dob_m = input.nextInt();
        System.out.println("Enter day: ");
        dob_d = input.nextInt();
        System.out.println("Enter year: ");
        dob_y = input.nextInt();
        System.out.println("Enter height (in inches): ");
        h = input.nextInt();
        profile.setHeight(h);
        System.out.println("Enter weight (in pounds): ");
        w = input.nextInt();
        profile.setWeight(w);
        profile.setBMI(w,h);
        profile.setAge(dob_y,dob_m,dob_d);
        rate.setMaxRate(rate.getAge());
        rate.setTargetRate(rate.getMaxRate());

        System.out.println("First name: "+profile.getFname());
        System.out.println("Last name: "+profile.getLname());
        System.out.println("Age: "+profile.getAge());
        System.out.println("Height: "+profile.getHeight());
        System.out.println("Weight: "+profile.getWeight());
        System.out.println("Maximum heart rate: "+rate.getMaxRate());
        System.out.println("Target heart rate range:");
        System.out.println("Minimum: "+rate.getLowBPM());
        System.out.println("Maximum: "+rate.getHighBPM());
        profile.getBMI();
    }
}
