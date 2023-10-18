package PrimeDirective;
import java.util.ArrayList;

        // How I would solve the problem just by reading it
public class PrimeDirective {

    public  boolean isPrime(int number){
            if ( number <= 1){
                return false;
            }
            for (int i = 2; i * i <= number; i++) {
                if( number % i == 0 ) {
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
                    System.out.println( numeros + " is prime");
                } else
                    System.out.println(numeros +  " is not prime");
            }

        }
}

    // How CodeAcademy would suggest


   /*
   // Import statement:
import java.util.ArrayList;

class PrimeDirective {

  // Add your methods here:
  public boolean isPrime(int number){
   if(number == 2){
    return true;
   } else if (number < 2){
    return false;
    }

   for(int i = 2; i < number; i++){
    if ( number % i == 0){
      return false;
    }
   }
   return true;
  }

  public ArrayList<Integer> onlyPrimes(int[] numbers){
    ArrayList<Integer> primes = new ArrayList<>();
    PrimeDirective pd = new PrimeDirective();

    for(int number: numbers){
     if(pd.isPrime(number))
      primes.add(number);
    }
    return primes;
  }

  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

    System.out.println(pd.isPrime(3));

    System.out.println(pd.onlyPrimes(numbers));


  }

}*/