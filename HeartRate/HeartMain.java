package HeartRate;
import java.util.*;
public class HeartMain {
    public static void main(String[] args){
        String f_name,l_name;
        int dob_m, dob_d, dob_y;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter month: ");
        dob_m = input.nextInt();
        System.out.println("Enter day: ");
        dob_d = input.nextInt();
        System.out.println("Enter year: ");
        dob_y = input.nextInt();

        HeartRates rate = new HeartRates();
        rate.setAge(dob_y,dob_m,dob_d);
        rate.setMaxRate(rate.getAge());
        rate.setTargetRate(rate.getMaxRate());

        System.out.println("First name: "+rate.getFname());
        System.out.println("Last name: "+rate.getLname());
        System.out.println("Age: "+rate.getAge());
        System.out.println("Maximum heart rate: "+rate.getMaxRate());
        System.out.println("Target heart rate range:");
        System.out.println("Minimum: "+rate.getLowBPM());
        System.out.println("Maximum: "+rate.getHighBPM());
    }
}
