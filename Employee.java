import java.util.ArrayList;
import java.util.Scanner;
public class Employee {

        public static void main(String[] args) {
            ArrayList<Integer> salaries = new ArrayList();

            salaries.add(3000);
            salaries.add(4000);
            salaries.add(3500);
            salaries.add(4500);
            salaries.add(5000);

            int total_salary = 0;
            for (int salary : salaries) {
                total_salary = total_salary + salary;
            }

            int averageSalary = total_salary / salaries.size();
            System.out.println("average salary: " + averageSalary);

            if (averageSalary < 4000) {
                System.out.println("salary is low");
            } else if (averageSalary >= 4000 && averageSalary < 5000) {
                System.out.println("salary is medium");
            } else {
                System.out.println("salary is high");
            }
        }
    }


