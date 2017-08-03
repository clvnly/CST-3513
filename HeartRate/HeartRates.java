package HeartRate;

public class HeartRates extends HealthProfile{
    private int maxbpm;
    private double targetbpm_high;
    private double targetbpm_low;

    public HeartRates(){
    }
    public void setMaxRate(int a){
        maxbpm = 220 - a;
    }
    public int getMaxRate(){
        return maxbpm;
    }
    public void setTargetRate(int a){
        targetbpm_high = a *.85;
        targetbpm_low = a *.5;
    }
    public double getHighBPM(){
        return targetbpm_high;
    }
    public double getLowBPM(){
        return targetbpm_low;
    }

}
