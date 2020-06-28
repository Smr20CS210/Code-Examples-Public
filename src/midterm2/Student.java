package midterm2;

/* subclass Student extending the Person class */
public class Student extends Person {
    // int age = 25; // not private, belongs to package

    // Student() {
    // }

    Student() {
        // invoke or call parent class constructor
        super();

        System.out.println("Student class Constructor");
    }

    Student(Integer age) {
        super(age);
        // this.age = age;
    }

    void getAge() {
        /*
         * print age of base class (Person)
         * Note: age is not private
         */
        System.out.println("Age: " + super.age);
    }

    void message() {
        System.out.println("This is student class");
    }

    // Note that display() is only in Student class
    void display() {
        // will invoke or call current class message() method
        message();

        // will invoke or call parent class message() method
        super.message();
    }
}
