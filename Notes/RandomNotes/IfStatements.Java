public class IfStatements {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        
        boolean isAwesomeDay = true;
        boolean shouldWork = x < y;

        String name = "Alex";

        // Pseudocode - structure, syntax, does not work
        // Conditional
        // if(condition){
        //     ...do something
        // }

        //Condition always needs to be boolean

        if(shouldWork && isAwesomeDay){   //Expression
            //run when shouldwork evaluates to true
            
        }

        if(shouldWork || isAwesomeDay){ 
            //if either one is true
        }

        if(!shouldWork) {  //not shouldWork
            //flip the output
        }

        //Code Smell - Anti-pattern
        if (shouldWork == true){
            //NEVER do this
        }

        if (y < x && shouldWork){

        }

        //if (x < y && < z){ //CODE SMELL
        //
        //}


        if (shouldWork) System.out.printLn("Should Work"); //Only when shouldwork   Dont USE
        System.out.printLn("Always runs"); // Always Runs


        if(shouldwork){
            //True
        }else {
            //False
        }

        if(shouldWork){

        }else if (isAwesomeDay){

        } else if (){

        }else{  //Must be last, optional

        }


        //Object equality is not the same as primative equality

        if (x == y){
            //X == Y, works fine
        }

        if (name == "Alex") {
            //Does not work
        }

        if ("Alex".equals(name)){
            //Walks through each character and compares data
        }

   }

   
    
}