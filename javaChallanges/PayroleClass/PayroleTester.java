public class PayroleTester {
    public static void main(String[] args){
        Employee bob = new Employee("Bob Joe", "Manager", 15.75);
        
        bob.work(8);
        bob.work(8);
        bob.work(4);
        bob.getHours();
        System.out.println(bob.getHours());


        System.out.println(bob.requestPaycheck());
    }
}
