public class Main {
    public static void main(String[] args) {
        System.out.println("--- US-01: Create & Display Student Object ---");
        Student student1 = new Student(101, "Alice Smith", 88.5);
        student1.displayDetails();

        System.out.println("\n--- US-02: String Formatting on Student Name ---");
        String sName = student1.name;
        System.out.println("Original Name: " + sName);
        System.out.println("Uppercase: " + sName.toUpperCase());
        System.out.println("Lowercase: " + sName.toLowerCase());
        System.out.println("Name Length: " + sName.length());

        System.out.println("\n--- US-03: Create and Print Marks Array ---");
        double[] studentMarks = {85.5, 90.0, 78.5, 92.0, 88.0};
        System.out.println("Marks of 5 students:");
        for (int i = 0; i < studentMarks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + studentMarks[i]);
        }

        System.out.println("\n--- US-04: Method Overloading for Billing ---");
        ProductBilling billing = new ProductBilling();
        System.out.println("Bill for 1 product: $" + billing.calculateBill(50.0));
        System.out.println("Bill for 2 products: $" + billing.calculateBill(50.0, 30.5));
        System.out.println("Bill for 3 products: $" + billing.calculateBill(50.0, 30.5, 20.0));

        System.out.println("\n--- US-05 & US-06: Employee Object & Static Variable ---");
        Employee emp1 = new Employee(501, "John Doe", 65000);
        Employee emp2 = new Employee(502, "Jane Roe", 72000);
        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
        // Demonstrating accessing static variable directly via the class
        System.out.println("Shared Company Name: " + Employee.companyName);

        System.out.println("\n--- US-07: Product Object with Getter/Setter ---");
        Product prod = new Product();
        prod.setProductName("Wireless Mouse");
        prod.setPrice(25.99);
        System.out.println("Product Name: " + prod.getProductName());
        System.out.println("Product Price: $" + prod.getPrice());

        System.out.println("\n--- US-08: Demonstrate Inheritance ---");
        CollegeStudent cStudent = new CollegeStudent(201, "Bob Martin", 91.0, "State University");
        cStudent.displayCollegeDetails();
    }
}