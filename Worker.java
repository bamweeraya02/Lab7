package employee;

public class Worker extends Employee{
    public Worker(int id, double salary) {
        this.id = id;
        this.salary = salary;

    }
    double calSalary() {
        if (salary > 6000) {
            return salary + 500;
        } else {
            return salary + 1000;
        }
    }
}