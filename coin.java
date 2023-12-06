import java.util.Scanner;

public class coin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount = scanner.nextInt();

        int thousands = amount / 1000;
        if (thousands != 0) {
            System.out.println(thousands + " * Rs.1000 note");
        }
        int fiveHundreds = (amount % 1000) / 500;
                if (fiveHundreds != 0) {
            System.out.println(fiveHundreds + " * Rs.500 note");
        }
        int hundreds = ((amount % 1000) % 500) / 100;
                if (hundreds != 0) {
            System.out.println(hundreds + " * Rs.100 note");
        }
        int fifties = (((amount % 1000) % 500) % 100) / 50;
                if (fifties != 0) {
            System.out.println(fifties + " * Rs.50 note");
        }
        int twenties = ((((amount % 1000) % 500) % 100) % 50) / 20;
                if (twenties != 0) {
            System.out.println(twenties + " * Rs.20 note");
        }
        int tens = (((((amount % 1000) % 500) % 100) % 50) % 20) / 10;
                if (tens != 0) {
            System.out.println(tens + " * Rs.10 note");
        }
        int fives = ((((((amount % 1000) % 500) % 100) % 50) % 20) % 10) / 5;
                if (fives != 0) {
            System.out.println(fives + " * Rs.5 coin");
        }
        int twos = (((((((amount % 1000) % 500) % 100) % 50) % 20) % 10) % 5) / 2;
                if (twos != 0) {
            System.out.println(twos + " * Rs.2 coin");
        }
        int ones = ((((((((amount % 1000) % 500) % 100) % 50) % 20) % 10) % 5) % 2) / 1;
                if (ones != 0) {
            System.out.println(ones + " * Rs.1 coin");
        }
        scanner.close();
    }
}
