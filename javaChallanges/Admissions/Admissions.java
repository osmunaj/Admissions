import java.util.Scanner;
//A. Elete level in at least one
//B. Solid level in two
//C. Last name is Padjent
//D. Nothing below acceptable


public class Admissions {
    public static void main(String[] args){

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your Name?");
        String name = scanner.nextLine();

        System.out.println("What is your SAT Score?");
        int satScore = scanner.nextInt();

        System.out.println("What is your class ranking?");
        int rank = scanner.nextInt();
        
        System.out.println("How many Awards?");
        int awards = scanner.nextInt();

        System.out.println("What is your residence?");
        String residence = scanner.next();

        scanner.close();

        boolean namePadjent = false;
        int numberOfElites = 0;
        int numberOfSolids = 0;
        int belowAcceptable = 0;

        int i = 0;

        if(name.substring(name.indexOf(" ") + 1, name.length()).equals("Padjent")){
            namePadjent = true;
        }

        if (satScore >= 1500){
            numberOfElites += 1;
            numberOfSolids += 1;
        }else if(satScore >= 1400){
            numberOfSolids += 1;
        }else if(satScore < 1200){
            belowAcceptable += 1;
        }

        if (rank >= 95){
            numberOfElites += 1;
            numberOfSolids += 1;
        }else if(rank >= 90){
            numberOfSolids += 1;
        }else if(rank < 85){
            belowAcceptable += 1;
        }

        if (awards >= 10){
            numberOfElites += 1;
            numberOfSolids += 1;
        }else if(awards >= 8){
            numberOfSolids += 1;
        }else if(awards < 3){
            belowAcceptable += 1;
        }

        if (residence.equals("Colorado")){
            numberOfElites += 1;
        }else if (residence.equals("Florida"));





       
        if (namePadjent && numberOfElites >= 1 && numberOfSolids >= 2 && belowAcceptable == 0){
            System.out.println("Congrats, you are acceptable!");   
        }else{
            System.out.println("Unfortunantly, you are not acceptable.");
        }


    }
}
