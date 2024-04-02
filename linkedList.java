import java.util.*;

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee other) {
        // First, compare based on name
        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison != 0) {
            return nameComparison;
        } else {
            // If names are equal, compare based on salary
            return Double.compare(this.salary, other.salary);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class linkedList{
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "John", "Manager", 50000));
        employees.add(new Employee(2, "Alice", "Developer", 60000));
        employees.add(new Employee(3, "Bob", "Tester", 45000));
        employees.add(new Employee(4, "Alice", "Designer", 55000));

        // Sort the employees based on name and salary
        Collections.sort(employees);

        // Print the sorted list
        System.out.println("Sorted Employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}