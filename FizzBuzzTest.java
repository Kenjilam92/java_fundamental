public class FizzBuzzTest {
    public static void main (String[] args){
        for (int i=0; i<=100; i++){
            System.out.print(fizzBuzz(i));
        }
    }
    public static String fizzBuzz(int number){
        if ( (number%3)==0 && (number%5) == 0){
            return "FizzBuzz ";
        }
        else if ( (number%3) == 0){
            return "Fizz ";
        }
        else if ( (number%5) == 0){
            return "Buzz ";
        }
        else {
            return String.format("%s ",number);
        }
    }


}