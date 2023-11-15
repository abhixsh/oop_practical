import java.util.Scanner;

public class getsum {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter Number 01:");
        int num1 = myObj.nextInt();

        System.out.println("Enter Number 02:");
        int num2 = myObj.nextInt();

        System.out.println(num1 + num2);
    }
}
