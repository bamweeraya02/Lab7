package employee;

public class Manager extends Employee{
    public Manager(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }
    double calSalary() {
        if (id > 300) {
            return salary*1.06;
        }else {
            return salary*1.04;
        }
    }
    
}