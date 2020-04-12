import java.util.HashSet;

public class Define {
    public static void main(String[] args) {
        Person a = new Person(23, "老大");
        Person b = new Person(45, "老二");
        Person c = new Person(23, "老大");
        HashSet<Person> people = new HashSet<>();
        people.add(a);
        people.add(b);
        people.add(c);
        System.out.println(people);
    }
}
