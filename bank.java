import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter Years: ");
        int years = scanner.nextInt();

        double rate  = 0.0;
        double compoundInterest = 0.0;

        if (amount < 1000 && years >= 2) {
            rate =  5.0;
        } else if (amount >= 1000 && amount <= 5000 && years >= 2) {
            rate = 7.0;
        } else if (amount > 5000 && years >= 1) {
            rate =  8.0;
        } else {
            rate = 0.0; 
        }

        for (int i = 0; i < years; i++) {
            compoundInterest += (amount * rate / 100);
            amount += compoundInterest; 
        }

        
        System.out.println("Deposit Amount: Rs. " + amount);
        System.out.println("Duration: " + years + " years");
        System.out.println("Interest Rate: " + rate + "%");
        System.out.println("Compound Interest: Rs. " + compoundInterest);

        scanner.close();
    }
}
