import java.util.Scanner;

public class pharmacy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double totalAmount = scanner.nextDouble();

        System.out.print("Enter age: ");
        int customerAge = scanner.nextInt();
    double discountRate = 0.0;

        if (totalAmount > 5000) {
            discountRate = 10.0;
        } else if (totalAmount > 2000) {
            discountRate =5.0;
        } else if (customerAge >= 60 && totalAmount > 2000) {
            discountRate = 8.0;
        } else if (customerAge >= 60 && totalAmount > 1000) {
            discountRate = 5.0;
        } else {
            discountRate = 0.0;
        }

        double discountAmount = totalAmount * (discountRate / 100);



        System.out.println("Total Amount: Rs. " + totalAmount);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Discount Amount: Rs. " + discountAmount);

        scanner.close();
    }
}