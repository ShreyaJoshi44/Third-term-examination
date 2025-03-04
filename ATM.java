import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correct = 1234;
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter your PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == correct) {
                System.out.println("pin is correct.");
                break;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("incorrect pin. now attempts: " + attempts);
                } else {
                    System.out.println("account locked.");
                }
            }
        }

        scanner.close();
    }
}
