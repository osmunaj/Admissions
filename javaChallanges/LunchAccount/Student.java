public class Student {
    private String name;
    double balance;
    int id = 1110;
    public Student(String name, double startingBalance){
        
        this.name = name;
        this.balance = startingBalance;
        this.id = id + 1;
        
    }

    public String getName(){
        return this.name;
    }


    public String getBalance(){
        return name + " has $" + balance + " in their account.";
    }
    public int getID(){
        return id;
    }

    public void addMoney(double money){
        balance += money;
    }

    public String buyStuff(double cost){
        String print = "";
        if (cost <= balance){
            balance -= cost;

            print += "Transaction sucsessful.";
        }else{
            print += "Transaction unsucsessful, not enough money in account.";
        }

        print += " Current Balance: $" + balance;
        return print;
    }

}
