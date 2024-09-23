import java.util.Scanner;

public class IT24100086Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);
            System.out.print("Enter total bill amount: ");
            double billAmount = scanner.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char paymentMode = scanner.next().charAt(0);

            double discount = 0;
            if (paymentMode == 'C' || paymentMode == 'c') {
                discount = billAmount * 0.05;
            } else if (paymentMode != 'O' && paymentMode != 'o') {
                System.out.println("Payment Mode is Not Valid");
                continue;
            }

            double amountToPay = billAmount - discount;

            System.out.println("Discount is: " + discount);
            System.out.println("Amount to be paid: " + amountToPay);
            System.out.println();
        }

        scanner.close();
    }
}