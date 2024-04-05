import org.jetbrains.annotations.NotNull;

public class Person implements Comparable<Person>{

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(@NotNull Person p) {
        return name.compareTo(p.name); // sort by name from a-z
//        return p.name.compareTo(name); // sort by name from z-a
    }
}
