    import java.util.Scanner;

public class PrintScedule {
    public static void main(String[]  args) {

        System.out.println("\tScedule:");                                                            //use \t to use a tab
        System.out.println("\n1. English 3\n2. American History\n3. AP Physics\n4. AP Compsci Principles"); //use \n to print it on a different line
        System.out.println("5. Honors Trig");                           
        System.out.println("6. Wind Ensemble");
        System.out.println("7. Jazz\n");

        

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");           
        String name = scanner.next();
        System.out.println("Hello " + name);

    }
}