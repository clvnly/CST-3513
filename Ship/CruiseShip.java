package Ship;

public class CruiseShip extends Ship{
    private int passengers;
    public CruiseShip(){
        passengers = 500;
    }
    public void setPassengers(int a){
        passengers = a;
    }
    public int getPassengers(){
        return passengers;
    }
    public String toString(){
        return "Name: "+super.getName()+", max passengers: "+this.passengers;
    }
}
