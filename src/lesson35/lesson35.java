package lesson35;

import lesson34.Person;

import java.util.*;

public class lesson35 {

    public static void main(String[] args) {
        System.out.println("============== ArrayList ===============");
        List<Integer> integerList = new ArrayList<>(List.of(5, 8, 3, 9, 4, 2, 1));
        System.out.println(integerList);
        System.out.println();

        System.out.println("============== HashSet ===============");

        Set<Integer> integerSet = new HashSet<>(List.of(5, 8, 3, 9, 4, 2, 1));
        System.out.println(integerSet);
        System.out.println();

        System.out.println("============== ArrayList ===============");

        List<String> strList = new ArrayList<>(List.of("Hello", "I", "love", "Java"));
        strList.add("too");
        strList.add("Java");
        System.out.println(strList);
        System.out.println();

        System.out.println("============== HashSet ===============");

        Set<String> strSet = new HashSet<>(List.of("Hello", "I", "love", "Java"));
        strSet.add("too");
        strSet.add("Java");
        System.out.println(strSet);
        System.out.println();

        System.out.println("============== LinkedHashSet ===============");

        Set<String> strLinkedSet = new LinkedHashSet<>(List.of("Hello", "I", "love", "Java"));
        System.out.println(strLinkedSet.add("too"));
        System.out.println(strLinkedSet.add("Java"));
        System.out.println(strLinkedSet);
        System.out.println();

        System.out.println("============== Person ===============");

        Person p1 = new Person("Mike", 35);
        Person p2 = new Person("Mike", 35);
        System.out.println(p1.equals(p2));

        System.out.println("============== HashMap ===============");

        Map<String, String> strMap = new HashMap<>();
        strMap.put("Paris", "France");
        strMap.put("Marcel", "France");
        System.out.println(strMap.get("Paris"));

        System.out.println("============== HashTable ===============");

        HashTableNew<String, Person> stringMap = new HashTableNew<>();
        stringMap.put("12D", new Person("Luke", 20));
        stringMap.put("A5Y", new Person("Mark", 24));
        System.out.println(stringMap);
        System.out.println(stringMap.get("12D"));
        System.out.println(stringMap.get("120QD"));



    }
}
