public class timeClass{
    public static void main(String[] args){
        //Hour, Minute, Second, am/pm

        //Abilities: Display itself, tell what general time it is ->Morning, afternoon, evening, etc
        
        time time = new Time();
        time.display();
        System.out.println(time);

        //                     h   m   s   am
        Time time2 = new Time(10, 30, 0, true);

        time.display();
    }
}
