public class WhileLoops {
    public static void main(String[] args){

        /**
         * pseudocode
         * 
         * while(condition){
         *  repeat me 
         * }
         * 
         * 
         */


         //example = count

        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        //example - password

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Password: ");
        String password = scanner.next();

        while(!password.equals("password")){
            System.out.println("Enter Password: ");
            password = scanner.next();
        }



        //Condition timing

        //While loops check the condition only at the start of the loop
        int x = 1;
        while (x > 0){
            x = 0;
            System.out.println("In loop");
            x = 1;

        }



        //Infinite loops

        //The condition needs to change, or your program will never stop

        while (true) {
            //Will go forever
            //use ctrl + c to stop 
        }


        int z = 0
        while (z < 100){
            System.out.println("Oops, z does not change");
        }

        //will never get here


        int foo = 0;
        while (foo < 10){
            int bar = 1;
            foo++;
        }

        
        //foo is accessable here but bar is not
        //a new bar is created each and every time the loop runs,
        //and is thrown out after the loop is complete

    
    }
}
