
public class Employee {
    int empId;
    String empName;
    double salary;
    
    // Shared static variable across all Employee objects
    static String companyName = "Global Tech Industries"; 

    // Constructor for direct initialization
    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + empId + ", Name: " + empName + 
                           ", Salary: $" + salary + ", Company: " + companyName);
    }
} 