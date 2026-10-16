package Day04;

public class Student {
    String name;
    int age;
    int marks;

    Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void display() {
        System.out.println(name + " " + age + " " + marks);
    }

    void isPassed() {
        if (marks > 40) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed.");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Akshata", 25, 21);
        Student s2 = new Student("Swayam", 22, 95);

        s1.display();
        s2.display();
        s1.isPassed();
    }
}
