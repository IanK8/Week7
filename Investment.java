public class InvestmentCalculator {
    public static void main(String[] args) {
        double initialInvestment = 2500.0;
        double targetValue = 5000.0;
        double annualInterestRate = 0.075; 
        int years = calculateYears(initialInvestment, targetValue, annualInterestRate);
        System.out.println("It will take " + years + " years for the investment to be worth at least $" + targetValue);
    }
    public static int calculateYears(double initialInvestment, double targetValue, double annualInterestRate) {
        int years = 0;
        double balance = initialInvestment;
        while (balance < targetValue) {
            double interest = balance * annualInterestRate;
            balance += interest;
            years++;
        }
        return years;
    }
}
