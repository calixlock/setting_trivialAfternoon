package collection;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        // Set 은 List와 유사하나 중복된 값을 허용하지 않는다.
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        System.out.println(hashSet);

        System.out.println("배열로 변환한 후 출력하는 방법");
        // 방법1.배열로 변환한 후 출력하는 방법
        Object[] ObjectSet = hashSet.toArray();
        for (int i = 0; i < ObjectSet.length; i++) {
            System.out.println(ObjectSet[i]);
        }

        System.out.println("향상된 for문을 사용하는 방법");
        // 방법2. 향상된 for문을 사용하는 방법
        for (Integer i : hashSet) {
            System.out.println(i);
        }

        System.out.println("iterator메서드를 사용하는 방법");
        // 방법3. iterator메서드를 사용하는 방법

        // Iterator<Integer> iter = hashSet.iterator();
        // while (iter.hasNext()) {
        // String iterNext = iter.next();
        // System.out.println(iterNext);
        // }

        System.out.println("forEach메서드를 사용하는 방법");
        // 방법4. forEach메서드를 사용하는 방법
        hashSet.forEach(name -> System.out.println(name));

    }

}
