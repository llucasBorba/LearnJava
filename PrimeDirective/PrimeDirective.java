package PrimeDirective;
import java.util.ArrayList;

public class PrimeDirective {

    public  boolean isPrime(int numbe){
            if ( numbe <= 1){
                return false;
            }
            for (int i = 2; i * i <= numbe; i++) {
                if( numbe % i == 0 ) {
                    return false;
                }
            }
            return true;
    }


    public static void main(String[] args){

            PrimeDirective pd = new PrimeDirective();

            int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
            ArrayList<Integer> numero = new ArrayList<>();
            for (int number : numbers) {
                numero.add(number);
            }

            for (int numeros: numero){
                if(pd.isPrime(numeros)){
                    System.out.println( numero + "é primo");
                } else
                    System.out.println(numero +  "nào é primo");
            }

        }
}
