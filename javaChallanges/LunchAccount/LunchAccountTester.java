public class LunchAccountTester {
    public static void main(String[] args){
        Student bob = new Student("Bob Carl", 7.00);
        Student joe = new Student("Joe Mama", 50.26);
        Student jane = new Student("Jane K", 25.00);
        System.out.println(bob.getID());
        System.out.println(joe.getID());  //FIX ID


        System.out.println(bob.buyStuff(10.00)); //Unsucsessful, not enough money in account
        bob.addMoney(15.00);
        System.out.println(bob.buyStuff(10.55)); //Sucsessful, current balance: 11.45

        System.out.println(jane.buyStuff(5.00)); //Sucsessful, balance: 20.00
        System.out.println(jane.getBalance());  //Jane K has 20 in their account
        


    }
}
