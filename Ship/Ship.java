package Ship;

public class Ship {
    private String name;
    private String year;
    public Ship(){
        name = "Big Boat";
        year = "1988";
    }
    public void setName(String a){
        name = a;
    }
    public void setYear(String a){
        year = a;
    }
    public String getName(){
        return name;
    }
    public String getYear(){
        return year;
    }
    public String toString(){
        return "Name: "+name+" Year: "+year;
    }
}
