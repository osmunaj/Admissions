import java.util.Random;
public class Employee {
    //Variables
    private String Name;
    private String Position;
    private double wage;
    private int id;
    private int hoursWorked;
    private Random random = new Random();
    
    //Constructors
    public Employee(String name, String position, double wage){
        this.name = name;
        this.position = position;
        this.wage = wage;
        this.id = random.nextInt(999999999);
    }
    //Getters & Setters

    public int getID(){
        return id;
    }
    //Abilities
    public void work(int hours){
        hoursWorked += hours;
    }

    public void requestPaycheck(){
        Paycheck paycheck = new Paycheck();
    }
}
