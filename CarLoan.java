public class CarLoan {
    int carLoan;
    int loanLength;
    int interestRate;
    int downPayment;

    public CarLoan(int carLoan, int loanLength, int interestRate, int downPayment){
        if( loanLength <= 0 ){
            System.out.println("Error! You must take out a valid car loan.");
        } else if (downPayment >= carLoan){
            System.out.println("The car can be paid in full.");
        }  else {
            this.carLoan = carLoan;
            this.loanLength = loanLength;
            this.interestRate = interestRate;
        }
    }
    public void monthlyPayment(){
        int remainingBalance = carLoan - downPayment;
        int months = loanLength * 12;
        int monthlyBalance = remainingBalance / months;
        int interest = (monthlyBalance * interestRate) / 100;
        int monthlyPayment = monthlyBalance + interest;
        System.out.println(monthlyPayment);
    }

    public static void main(String[] args) {

        CarLoan myloan = new CarLoan(10000,3,5,2000);
        myloan.monthlyPayment();

    }
}