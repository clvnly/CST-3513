package Ship;

public class CargoShip extends CruiseShip{
    int cargo;
    public CargoShip(){
        cargo = 1500;
    }
    public void setCargo(int a){
        cargo = a;
    }
    public int getCargo(){
        return cargo;
    }
    public String toString(){
        return "Name: "+super.getName()+", cargo: "+this.cargo;
    }
}
