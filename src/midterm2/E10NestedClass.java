package midterm2;

//outer class 
class OuterClass {
    // static member
    static int outer_x = 10;

    // instance(non-static) member
    int outer_y = 20;

    // private member
    private static int outer_private = 30;

    // static nested class
    static class StaticNestedClass {
        void display() {
            // can access static member of outer class
            System.out.println("outer_x = " + outer_x);

            // can access display private static member of outer class
            System.out.println("outer_private = " + outer_private);

            // The following statement will give compilation error
            // as static nested class cannot directly access non-static membera
            // System.out.println("outer_y = " + outer_y);

        }
    }

    // inner class
    class InnerClass {
        void display() {
            // can access static member of outer class
            System.out.println("outer_x = " + outer_x);

            // can also access non-static member of outer class
            System.out.println("outer_y = " + outer_y);

            // can also access a private member of the outer class
            System.out.println("outer_private = " + outer_private);

        }
    }
}

public class E10NestedClass {
    public static void main(String[] args) {
        // accessing a static nested class
        // OuterClass.StaticNestedClass nestedObject = new
        // OuterClass.StaticNestedClass();
        //
        // nestedObject.display();

        /*
         * To instantiate an inner class, you must first instantiate the outer
         * class. Then, create the inner object within the outer object with
         * this syntax:
         */
        // accessing an inner class
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();

        innerObject.display();

    }
}
