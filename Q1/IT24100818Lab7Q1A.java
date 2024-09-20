import java.util.Scanner;

public class IT24100818Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int subject1, subject2, subject3, subject4;
        double average;
        
        System.out.println("Enter marks for four subject: ");
        System.out.println("Enter marks for subject 1: ");
        subject1 = input.nextInt();

        System.out.println("Enter marks for subject 2: ");
        subject2 = input.nextInt();

        System.out.println("Enter marks for subject 3: ");
        subject3 = input.nextInt();

        System.out.println("Enter marks for subject 4: ");
        subject4 = input.nextInt();

        average = (subject1 + subject2 + subject3 + subject4) / 4.0;

        System.out.println("\nAverage is: " + average);

        if (average >= 75 && average <= 100) {
            System.out.println("Overall grade is: Distinction");
        } else if (average >= 50 && average < 75) {
            System.out.println("Overall grade is: Credit");
        } else {
            System.out.println("Overall grade is: Fail");
        }
    }
}