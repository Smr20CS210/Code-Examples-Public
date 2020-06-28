package midterm2;

public class E10Super {
    public static void main(String args[]) {
        // superVariables();
        // superMethod();
        superConstructor();
    }

    public static void superVariables() {
        Student s = new Student();
        s.getAge();
    }

    public static void superMethod() {
        Student s = new Student();
        // calling display() of Student
        s.display();
    }

    public static void superConstructor() {
        Student s = new Student(15);
        System.out.println(s.age);
    }
}
