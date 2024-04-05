import java.util.*;

public class lesson34 {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(List.of(5, 3, 6, 2, 4, 1));
        System.out.println(ints);

        System.out.println("============ sort the list ==========");

        Collections.sort(ints);
        System.out.println(ints);

        System.out.println("============ new case ==========");

        List<Person> persons = new ArrayList<>(List.of(
                new Person("John", 35),
                new Person("Mark", 21),
                new Person("Luke", 37),
                new Person("Luke", 31),
                new Person("Luke", 26)));
        System.out.println(persons);

        System.out.println("============ sort the persons ==========");

        Collections.sort(persons);
        System.out.println(persons);

//        AgeComparator ageComparator = new AgeComparator();
//
//        Collections.sort(persons, ageComparator);
//        System.out.println(persons);

//        NameAgeComparator nameAgeComparator = new NameAgeComparator();
//        Collections.sort(persons, nameAgeComparator);
//        System.out.println(persons);

//        Comparator<Person> ageComparator = ((o1, o2) -> (Integer.compare(o1.getAge(), o2.getAge())));
        Comparator<Person> nameAgeComparator = (o1, o2) -> {
            int nameCompare = o1.getName().compareTo(o2.getName());
            if (nameCompare == 0) {
                return o1.getAge() < o2.getAge()? - 1 : (o1.getAge() == o2.getAge()? 0 : 1);
            }
            return nameCompare;
        };

        Collections.sort(persons, nameAgeComparator);
        System.out.println(persons);



    }
}
