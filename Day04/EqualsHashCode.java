package Day04;

import java.util.Objects;

public class EqualsHashCode {

    static class Student {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void display() {
            System.out.println(name + " " + age);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;

            if (!(obj instanceof Student)) {
                return false;
            }

            Student other = (Student) obj;

            return age == other.age
                    && Objects.equals(name, other.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Amit", 21);
        Student s2 = new Student("Amit", 21);

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}