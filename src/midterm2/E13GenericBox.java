package midterm2;

import java.util.ArrayList;

public class E13GenericBox {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        // GenericBox gbox = new GenericBox();
        GenericBox<String> gbox = new GenericBox();
        gbox.put("abc");
        System.out.println(gbox.get());
    }
}
