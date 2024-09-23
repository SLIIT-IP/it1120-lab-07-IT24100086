import java.util.Scanner;

public class IT24100086Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int student = 1; student <= 3; student++) {
            System.out.println("Student " + student);
            System.out.print("Enter marks: ");
            
            int mark1 = scanner.nextInt();
            int mark2 = scanner.nextInt();
            int mark3 = scanner.nextInt();
            int mark4 = scanner.nextInt();

            double average = (mark1 + mark2 + mark3 + mark4) / 4.0;
            String grade;

            if (average >= 75 && average <= 100) {
                grade = "Distinction";
            } else if (average >= 50 && average < 75) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.printf("Average is: %.1f\n", average);
            System.out.println("Overall Grade is: " + grade);
            System.out.println();  
        }

        scanner.close();
    }
}
