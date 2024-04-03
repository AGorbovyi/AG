import java.util.*;

public class lesson33 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(25);
        integers.add(5);
        integers.add(3);
        integers.add(-4);
//        System.out.println(integers);
//
//        integers.remove(Integer.valueOf(3));
//        System.out.println(integers);

//        System.out.println("======================");
//
//        Deque<String> strings = new LinkedList<>();
//        strings.add("I");
//        strings.add("love");
//        strings.add("Java");
//        System.out.println(strings);
//
//        strings.push("+");
//        System.out.println(strings);
//
//        strings.pop();
//        System.out.println(strings);


//        for (Integer item : integers) {
//        System.out.println(intem);

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer item = iterator.next();
            System.out.println(item);
        }

        RubberArrayLesson33<Integer> integerList = new RubberArrayLesson33<>();
        integerList.add(7);
        integerList.add(12);
        integerList.add(1);
        System.out.println(integerList);
//        for (Integer item : integerList) {
//            System.out.println();
//        }

        Iterator<Integer> itr = integerList.iterator();
        while (itr.hasNext()) {
            Integer item = itr.next();
            System.out.println(item);
        }
    }

}
