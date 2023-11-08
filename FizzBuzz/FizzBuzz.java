package FizzBuzz;

public class FizzBuzz {
 //A classic FizzBUzz problem, where will print Buzz for numbers divide by 5
 // Fizz for those divide by 3 and Fizz Buzz for those one Ddivide by both
    public static void main(String[] args){


        for(int i = 1; i<=100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("LearJava/FizzBuzz");
            } else if( i % 5 == 0){
                System.out.println("Buzz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            }else
                System.out.println(i);
        }



    }
}

