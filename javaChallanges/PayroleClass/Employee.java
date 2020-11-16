import java.util.Random;
public class Employee {
    //Variables
    private String name;
    private String position;
    private double wage;
    private int id;
    private int hoursWorked;
    private int totalHoursWorked;
    private Random random = new Random();
    
    //Constructors
    public Employee(String name, String position, double wage){
        this.name = name;
        this.position = position;
        this.wage = wage;
        this.id = random.nextInt(999999999);
        this.hoursWorked = 0;
        this.totalHoursWorked = 0;
    }
    //Getters & Setters

    public int getID(){
        return id;
    }
    public int getHours(){
        return this.hoursWorked;
    }
    //Abilities
    public void work(int hours){
        this.hoursWorked += hours;
        this.totalHoursWorked += hours;
    }

    public String requestPaycheck(){
        Paycheck paycheck = new Paycheck();
        
        return name + " worked " + hoursWorked + " hours as " + position + " earning $" + wage + " an hour, earning $" + ((wage * hoursWorked)/0.15) + ", minus taxes.";
        this.hoursWorked = 0;
    }
}
