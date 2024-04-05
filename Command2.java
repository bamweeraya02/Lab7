package employee;
import java.util.Scanner;

public class Command2 {

    public static void main(String[] args) {
        int id;
        double salary;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your id: ");
        id = scanner.nextInt();
        System.out.print("Enter your salary: ");
        salary = scanner.nextDouble();

        if(id >= 0 && id <= 500) {
            Manager manager = new Manager(id, salary);
            System.out.println("You are Manager.");
            System.out.printf("Your new salary is %.2f Bath.\n", manager.calSalary());
        } else if (id > 500) {
            Worker worker = new Worker(id, salary);
            System.out.println("You are Worker.");
            System.out.printf("Your new salary is %.2f Bath.\n", worker.calSalary());
        } else {
            System.out.println("Invalid ID " + id + ".");
        }

    }
}