public class Lazo_p2 {

}

class SavingsAccount{

        private static double annualInterestRate = 0.00;

        private double savingsBalance;

        public SavingsAccount(double input) {

            savingsBalance = input;

        }

        public void calculateMonthlyInterest () {

                double interest;

                interest = savingsBalance * annualInterestRate;

                double monthlyInterest = interest/12;

                savingsBalance = monthlyInterest + savingsBalance;

        }

        public static void modifyInterestRate (double annualIR2){

            annualInterestRate = annualIR2;

        }

        public void PrintStatements1(){

            System.out.printf("$%.2f\n", savingsBalance);

        }

        public void PrintStatements2(){

            System.out.printf("$%.2f\n", savingsBalance);

        }

public static void Application(){
    SavingsAccount saver1=new SavingsAccount(2000.00);
    SavingsAccount saver2=new SavingsAccount(3000.00);

    //setting it to be the correct interest rate
    double x = 0.04;

    SavingsAccount.modifyInterestRate(x);
    System.out.println("\nFor 4% interest rate:\n");
    for (int i=1; i <13; ++i) {

        saver1.calculateMonthlyInterest();

        saver2.calculateMonthlyInterest();

        System.out.print("\nMonth " + i + ":\n\nFor:\nSavings Account 1: ");
        saver1.PrintStatements1();

        System.out.print("\nSavings Account 2: ");
        saver2.PrintStatements2();
    }
    double y = 0.05;

    SavingsAccount.modifyInterestRate(y);
    System.out.println("\n\nFor 5% interest rate:\n");
    for (int i=1; i <13; ++i) {


        saver1.calculateMonthlyInterest();

        saver2.calculateMonthlyInterest();

        System.out.print("\nMonth " + i + ":\n\nFor:\nSavings Account 1: ");
        saver1.PrintStatements1();

        System.out.print("\nSavings Account 2: ");
        saver2.PrintStatements2();
    }


}
    public static void main(String[] args) {

        Application();


        return;

    }
}






