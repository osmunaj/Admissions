public class TernaryExample {
    public static void main(String[] args){
        // ? : can replace simple if else statements 
        //Instead of this

        int x = 10;

        int value = 0;

        if (x < 10){
            value = 100;
        }else{
            value = 200;
        }

        //You can use this

        int value2 = x < 10 ? 100 : 200;
    }    
}
