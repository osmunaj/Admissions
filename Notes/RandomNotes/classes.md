# Class

Used to create multiple versions of the same thing
NOT AN OBJECT; a blueprint, to make multiple versions 

    intstance
      |
Car car = new Car();
car.drive();
car.setMake("Ford");

Car truck = new Car();
truck.setMake("Toyota");

public class Car {
    //data, variables
    private String make;
    private String model;           PRIVATE
    private int year;
    private double speed;
    private int gear;

    //CONSTURCTOR
    public Car(String make){
        //set default value
        this.make = make;
    }

    //abilities, methods

    //never static functions

    public void drive(){            Methods
        speed += 10;                
        
        if (speed > 10){
            gear += 1;
        }
    }

    public String getMake(){        Getter: function to get a variable
        return make;
    }
    public void setMake(String make){
        this.make = make;
    }


}

int x = 0;
doStuff(){
    x = 3
}

anotherFunction(){
    int y = x
}




public class Dog{
    private String name;
    private double speed;

    public Dog(){

    }

    public void sitAndStay(double speed){
        this.speed = 0;
    }

    public String speak(){
        return "Woof"
    }

}
