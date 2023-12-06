import java.util.Scanner;

public class grade {
    public static void main(String[] args) {

        String grade;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quiz score: ");
        double quizScore = scanner.nextDouble();
        System.out.print("Mid-term score: ");
        double midtermScore = scanner.nextDouble();
        System.out.print("Final score: ");
        double finalScore = scanner.nextDouble();
        scanner.close();
        double avg = (quizScore + midtermScore + finalScore) / 3;

        if (avg >= 90) {
            grade= "A";
        } else if (avg >= 70 && avg < 90) {
            grade="B";
        } else if (avg >= 50 && avg < 70) {
            grade= "C";
        } else if (avg < 50) {
            grade= "F";
        } else {
            grade= "Invalid";
        }


        System.out.println("Average Score: " + avg);
        System.out.println("Grade: " + grade);

    }}