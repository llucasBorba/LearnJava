package PrimeDirective;
import java.util.ArrayList;

public class PrimeDirective {

    public  boolean isPrime(ArrayList<Integer> numbers){
        for (int i = 0; i < numbers.size(); i++ ) {
            if ( numbers.get(i) > 1 && numbers.get(i) / i == 1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

        System.out.println(isPrime(numbers));

    }
}
