import java.util.Scanner;

public class factorial {
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter Number:");
        int num1 = myObj.nextInt();
        int finalans =1;


        for (int i = num1; i > 0; i--) {
            finalans = finalans*i;
          }
        

        System.out.println(finalans);
    }
}
