package LearJava.CarLoan;

public class CarLoan {
    // creating filds
    int carLoan;
    int loanLength;
    int interestRate;
    int downPayment;

    // Constructor
    public CarLoan(int carLoan, int loanLength, int interestRate, int downPayment){
        if( loanLength <= 0 ){
            System.out.println("Error! You must take out a valid car loan.");
        } else if (downPayment >= carLoan){
            System.out.println("The car can be paid in full.");
        }  else {
            this.carLoan = carLoan;
            this.loanLength = loanLength;
            this.interestRate = interestRate;
            this.downPayment = downPayment;
        }
    }
        //Finding out how much you are going to pay in each monthy
    public void monthlyPayment(){
        int remainingBalance = carLoan - downPayment;
        int months = loanLength * 12;
        int monthlyBalance = remainingBalance / months;
        int interest = (monthlyBalance * interestRate) / 100;
        int monthlyPayment = monthlyBalance + interest;
        System.out.println(monthlyPayment);
    }

    public static void main(String[] args) {

        //Creating a Loan
        CarLoan myloan = new CarLoan(10000,3,5,2000);

        // Calling a method
        myloan.monthlyPayment();

    }
}