package HeartRate;

import java.time.LocalDate;
import java.time.Period;

public class HealthProfile {
    private String fname;
    private String lname;
    private int age, height, weight;
    private double bmi;

    public HealthProfile(){
        fname = "Bob";
        lname= "Blue";
        age=34;
        height=72;
        weight=150;
    }
    public void setName(String a, String b){
        fname = a;
        lname = b;
    }
    public void setAge(int year, int month, int day){
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);
        Period p = Period.between(birthday, today);
        age = p.getYears();
    }
    public String getFname(){
        return fname;
    }
    public String getLname(){
        return lname;
    }
    public int getAge() {
        return age;
    }
    public void setHeight(int h){
        height = h;
    }
    public void setWeight(int w){
        weight = w;
    }
    public int getHeight(){
        return height;
    }
    public int getWeight(){
        return weight;
    }
    public void setBMI(int w, int h){
        bmi = ((w * 703)/(h * h));
    }
    public void getBMI(){
        System.out.println("BMI: "+bmi);
        if(bmi<18.5){
            System.out.println("Underweight");
        }
        if(bmi>=18.5 && bmi<=24.9){
            System.out.println("Normal BMI");
        }
        if(bmi>=25 && bmi<=29.9){
            System.out.println("Overweight");
        }
        if(bmi>=30){
            System.out.println("Obese");
        }
    }
}
