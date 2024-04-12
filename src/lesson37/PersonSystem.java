package lesson37;

import java.util.*;

public class PersonSystem {
    static Scanner scanner = new Scanner(System.in);
    static Map<Integer, Person> idMap = new HashMap<>();
    public static void main(String[] args) {
        int id, age;
        String name;

        List<Person> persons = new ArrayList<>();

        System.out.println("Simple personal system: ");

        char operation = 0;

        do {
            System.out.print("Enter operation ([a]dd, [d]elete, [u]pdate, [p]rint, [f]ind, e[x]it): ");
            operation = scanner.next().charAt(0);
            switch (operation) {
//                case 'a':
//                    System.out.println("Add: name & age: ");
//                    name = scanner.next();
//                    age = scanner.nextInt();
//                    persons.add(name, age);
//                    break;
//                case 'd':
//                    System.out.println("Delete: id: ");
//                    id = scanner.nextInt();
//                    persons.delete(id);
//                    break;
//                case 'u':
//                    System.out.println("Update: id & name & age: ");
//                    id = scanner.nextInt();
//                    name = scanner.next();
//                    age = scanner.nextInt();
//                    persons.update(id, name, age);
//                    break;
//                case 'p':
//                    System.out.println(persons);
//                    break;
//                case 'f':
//                    System.out.println("Find: id: ");
//                    id = scanner.nextInt();
//                    System.out.println(persons.find(id));
//                    break;
                case 'x':
                    break;
                default:
                    System.out.println("Undefined operation: " + operation);
            }
        } while (operation != 'x');
    }


}
