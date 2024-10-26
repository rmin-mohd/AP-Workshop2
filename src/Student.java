import java.util.Scanner;

public class Student {

    private int age;
    private String name;
    private String Id;
    private double grade;

    // Constructor
    public Student(int age, String name, String Id) {
        this.age = age;
        this.name = name;
        this.Id = Id;
        this.grade = 0; // default grade
    }

    // Method to print student info
    public void printStudentInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Id: " + Id + ", Grade: " + grade);
    }

    // Method to set grade
    public void setGrade(double grade) {
        this.grade = grade;
    }

    // Method to get grade
    public double getGrade() {
        return grade;
    }

    // Main method
    public static void main(String[] args) {
        // Corrected object creation with int for age
        Student std1 = new Student(18, "Mohd", "401314");
        std1.printStudentInfo();

        Student std2 = new Student(20, "Raza", "401315");
        std2.printStudentInfo();

        // Set grade values (note the use of double)
        std1.setGrade(19.0);
        std2.setGrade(21.0);

        // Print grades to confirm
        System.out.println("Updated Grade for " + std1.name + ": " + std1.getGrade());
        System.out.println("Updated Grade for " + std2.name + ": " + std2.getGrade());
    }
}
