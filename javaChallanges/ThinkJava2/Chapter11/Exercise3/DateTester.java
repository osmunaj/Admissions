public class DateTester {
    public static void main(String[] args){
        Date birthday = new Date(31, 7, 2021);
        System.out.println(birthday.timeUntilDay(11, 11, 2020));
    }
}
