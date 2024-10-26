import java.util.ArrayList;

public class Student {

    private int age;
    private String name;
    private String id;
    private double grade;

    public Student(int age, String name, String id) {
        this.age = age;
        this.name = name;
        this.id = id;
        this.grade = 0;
    }

    public void printStudentInfo() {
        System.out.println(name + " - ID: " + id + " - grade: " + grade);
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student std1 = new Student(15, "Raza", "410314");
        std1.setGrade(20.0);
        std1.printStudentInfo();
        
        Student std2 = new Student(20, "Mohd", "410315");
        std2.setGrade(19.0);
        std1.printStudentInfo();
        std2.printStudentInfo();

        Lab lab = new Lab("Mr.Smith", "Monday", 30);
        lab.addStudent(std1);
        lab.addStudent(std2);

        lab.printLabInfo();
    }
}

class Lab {

    private String teacherName;
    private String dayOfWeek;
    private int maxSize;
    private ArrayList<Student> students;

    public Lab(String teacherName, String dayOfWeek, int maxSize) {
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (students.size() < maxSize) {
            students.add(student);
        } else {
            System.out.println("Lab is full. Cannot add more students.");
        }
    }

    public void printLabInfo() {
        System.out.println("Teacher: " + teacherName);
        System.out.println("Day of Week: " + dayOfWeek);
        System.out.println("Max Size: " + maxSize);
    }
}
