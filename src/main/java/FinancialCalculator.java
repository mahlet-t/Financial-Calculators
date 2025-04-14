import java.util.Scanner;

public class FinancialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("choose calculator:");
            System.out.println("1 A mortgage calculator");
            System.out.println("2 Future value calculator");
            System.out.println("3 present value calculator");
            System.out.println("0 Exit");
            String choose = input.nextLine();
            if (choose.equals("1")) {
                try {

                    System.out.println("enter the principal ");
                    double principal = input.nextDouble();
                    input.nextLine();
                    System.out.println("enter loan length in years (numbers only)");
                    double length = input.nextDouble();
                    input.nextLine();
                    System.out.println("interest rate");
                    double rate = input.nextDouble();
                    input.nextLine();

                    double r = (rate / 100) / 12;
                    double n = length * 12;
                    double monthlyPayment = (principal * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
                    double totalPaid = monthlyPayment * n;
                    double TotalInterest = totalPaid - principal;
                    System.out.printf("Monthly payment:%.2f\n", monthlyPayment);
                    System.out.printf("Total interest :%.2f\n", TotalInterest);
                } catch (Exception e) {
                    System.out.println("invalid input. please enter numbers only.");
                    input.nextLine();// clear the wrong input
                }
            } else if (choose.equals("2")) {
                try {
                    System.out.println("enter deposit amount");
                    double deposit = input.nextDouble();
                    input.nextLine();
                    System.out.println("enter interest rate");
                    double InterestRate = input.nextDouble();
                    input.nextLine();
                    System.out.println("enter number of years(numbers only)");
                    double numberOfYears = input.nextDouble();
                    input.nextLine();
                    double FutureValue = deposit * Math.pow(1 + (InterestRate / 100) / 365, 365 * numberOfYears);
                    double interestEarned = FutureValue - deposit;
                    System.out.printf("Future value:%.2f\n", FutureValue);
                    System.out.printf("Total interest earned:%.2f\n", interestEarned);
                } catch (Exception e) {
                    System.out.println("invalid input. please enter numbers only.");
                    input.nextLine();// clear the wrong input
                }
            } else if (choose.equals("3")) {
                try {

                    System.out.println("enter monthly payout");
                    double payOut = input.nextDouble();
                    input.nextLine();
                    System.out.println("enter expected interest rate");
                    double expectedRate = input.nextDouble();
                    input.nextLine();
                    System.out.println("Years to pay out");
                    double Years = input.nextDouble();
                    input.nextLine();
                    double R = (expectedRate / 100) / 12;
                    double N = Years * 12;
                    double PresentValue = payOut * (1 - Math.pow(1 + R, -N)) / R;
                    System.out.printf("Present value of annuity:%.2f\n", PresentValue);
                } catch (Exception e) {
                    System.out.println("invalid input. please enter numbers only.");
                    input.nextLine();// clear the wrong input

                }
            } else if (choose.equals("0")) {
                try {

                    System.out.println("Thank you for choosing us! Good bye!");
                    break;

                } catch (Exception e) {
                    System.out.println("invalid input. please enter numbers only.");
                    input.nextLine();// clear the wrong input
                }
            } else {

                System.out.println("input invalid try again");
            }
        }
    }

}
