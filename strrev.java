import java.util.Scanner;

public class strrev {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter word:");
        String word = myObj.nextLine();
        
        int len = word.length();
        char[] charArray = word.toCharArray();

        for(int i = 0, j= len-1;i<j;i++,j--){
            char temp= charArray[i];
            charArray[i]=charArray[j];
            charArray[j]=temp;
        }

        String finalword = new String(charArray);
        System.out.println(finalword);
    }
}
