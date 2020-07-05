package midterm2;

import java.util.ArrayList;

public class Generics {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("CSC210");
        list.add("Happy Monday");

        // 1. Annoying casting
        String test = (String) list.get(1);

        // 2. This in NOT type safe
        list.add(67);
        String str = (String) list.get(2);

        // GenericBox box = new GenericBox();
        // GenericBox stringBox = new GenericBox();

        GenericBox<Integer> box = new GenericBox<Integer>();
        GenericBox<String> stringBox = new GenericBox<String>();
        GenericBox<Double> doubleBox = new GenericBox<>();

    }

}
