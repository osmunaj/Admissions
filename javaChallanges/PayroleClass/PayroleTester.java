public class PayroleTester {
    public static void main(String[] args){
        Employee bob = new Employee("Bob Joe", "Manager", 15.75);
        
        bob.work(8);
        System.out.println(bob.getID());

        bob.requestPaycheck();
    }
}
