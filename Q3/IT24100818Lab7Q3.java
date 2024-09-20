import java.util.Scanner;

public class IT24100818Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalBill, discount, amountToBePaid;
        char paymentMode;
        final double DISCOUNT_RATE = 0.05;

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nEnter the total bill amount" + i + ": ");
            totalBill = input.nextDouble();

            System.out.println("Enter the mode of payment (C for Cash, O for Other): ");
            paymentMode = input.next().charAt(0);

            paymentMode = Character.toUpperCase(paymentMode);

            if (paymentMode == 'C') {
                discount = totalBill * DISCOUNT_RATE;
                amountToBePaid = totalBill - discount;
                System.out.println("Discount is: " + discount);
                System.out.println("Amount to be paid: " + amountToBePaid);
            } else if (paymentMode == 'O') {
                System.out.println("No discount applicable.");
                System.out.println("Amount to be paid: " + totalBill);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }
        }

        input.close();
    }
}