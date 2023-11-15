import java.util.Scanner;

public class arraysum {
    public static void main(String[] args){
        int sum=0;
        Scanner sc= new Scanner(System.in);
        
        int [] array = new int[10];
        System.out.println("Enter numbers");
        for(int i =0; i<10;i++){
            array[i]=sc.nextInt();

        }
        for(int i=0;i<10;i++){
            sum=sum+array[i];
    }
     System.out.println(sum);
}
}