package midterm2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class MyClass {
    private String name;
    private int counter;
    private Map<String, Integer> map = new HashMap<>();

    private List<String> nameList = new LinkedList<>();

    public void setName(String name) {
        this.name = name;
        if (!map.containsKey(name)) {
            map.put(name, counter++);
        }
        nameList.add(name);
    }

    public List<String> getNamesList() {
        return nameList;
    }

    public List<String> shallowCopyList() {
        return new LinkedList<String>(nameList);
    }

    public Map<String, Integer> getNamesMap() {
        return map;
    }

    public Map<String, Integer> shallowCopyMap() {
        return new HashMap<String, Integer>(map);
    }
}

public class TestReturn {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.setName("hello");
        mc.setName("world");
        // Map<String, Integer> map = mc.getNamesMap();
        Map<String, Integer> map = mc.shallowCopyMap();
        System.out.println(map);
        map.remove("hello");
        System.out.println(mc.getNamesMap());
    }
}
