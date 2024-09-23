import java.util.Scanner;

public class IT24100086Lab7Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mark1, mark2, mark3, mark4;
        double average;
        String grade;

        System.out.println("Enter marks for four subjects:");
        
        System.out.print("Enter Subject Mark 1: ");
        mark1 = scanner.nextInt();
        
        System.out.print("Enter Subject Mark 2: ");
        mark2 = scanner.nextInt();
        
        System.out.print("Enter Subject Mark 3: ");
        mark3 = scanner.nextInt();
        
        System.out.print("Enter Subject Mark 4: ");
        mark4 = scanner.nextInt();

        average = (mark1 + mark2 + mark3 + mark4) / 4.0;
        
        if (average >= 75 && average <= 100) {
            grade = "Distinction";
        } else if (average >= 50 && average < 75) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }
        System.out.printf("Average is: %.1f\n", average);
        System.out.println("Overall Grade is: " + grade);

        scanner.close();
    }
}
