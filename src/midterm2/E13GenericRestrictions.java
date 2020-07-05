package midterm2;

public class E13GenericRestrictions {
    public static void main(String[] args) {
        // The following will generate errors.

        // List<Integer>[] array = new ArrayList<Integer>[5];
        // List<String> list = new ArrayList<String>();
        // Object[] objArray = array;
        // objArray[0] = list;
        // Integer id = objArray[0].get(0);
    }
}
