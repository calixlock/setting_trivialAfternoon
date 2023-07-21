package collection;

import java.util.ArrayList;

public class ListCollection {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Peter");
        names.add("Mary");
        System.out.println(names);

        names.remove("John");
        System.out.println(names);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        checkEmpty.Empty(names);
        // names.size();

        names.clear();
        System.out.println(names);
    }
}
