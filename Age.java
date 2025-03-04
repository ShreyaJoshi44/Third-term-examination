import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age");
        int age = scanner.nextInt();

        if (age >= 0 && age <= 12) {
            System.out.println("you're a child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("you're a teenager");
        } else if (age >= 20 && age <= 59) {
            System.out.println("you're an adult");
        } else if (age >= 60) {
            System.out.println("you're a senior");
        } else {
            System.out.println("invalid age number. input again.");
        }

        scanner.close();
    }
}


