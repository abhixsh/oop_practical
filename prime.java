import java.util.Scanner;

public class prime {
    public static void main(String[] args){
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = myObj.nextInt();

        int flag =0;

        for(int i=1;i>num;i++){
            if (i % num==0) {
                 flag =1;
                 break;
            }
        }
        if (num<2||flag==1) {
            System.out.println("This is a Not Prime Number");
            
        }
        else{
            System.out.println("This is a Prime Number");
        }
    }
}
