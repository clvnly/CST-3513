package Ship;
public class ShipDemo {
    public static void main(String[] args){
        Ship[] ships = new Ship[2];
        ships[0] = new Ship();
        ships[1] = new CruiseShip();
        ships[2] = new CargoShip();


        for (int i = 0; i < ships.length; i++)
        {
            System.out.println(ships[i].toString());
        }
    }
}
