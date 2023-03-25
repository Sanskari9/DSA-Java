 class Vehicle{
    private String color;
    int maxSpeed;
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void print(){
        System.out.println("color "+ color +" maxSpeed "+maxSpeed);
    }
}
class Car extends Vehicle{
    int numDoors;
    public void print(){
        System.out.println("Car "+"color "+ getColor() +" maxSpeed "+maxSpeed);
    }
}
class Bicycle extends Vehicle{
    int model;
}
public class Inheritance {
    public static void main(String [] args){
        Vehicle V = new Vehicle();
        V.setColor("Red");
        V.maxSpeed = 200 ;
        V.print();
        Car C = new Car();
       C.setColor("Black");
        C.maxSpeed = 100;
        C.print();
    }
}
