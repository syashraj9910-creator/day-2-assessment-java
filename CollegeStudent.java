public class CollegeStudent extends Student {
    String universityName;

    // Constructor calling the parent class constructor using 'super'
    public CollegeStudent(int rollNo, String name, double marks, String universityName) {
        super(rollNo, name, marks);
        this.universityName = universityName;
    }

    public void displayCollegeDetails() {
        // Reusing the method from the parent class
        displayDetails(); 
        System.out.println("University: " + universityName);
    }
} 
    