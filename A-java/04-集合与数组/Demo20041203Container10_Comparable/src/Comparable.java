import java.util.ArrayList;
import java.util.Collections;

public class Comparable {
    public static void main(String[] args) {
        Person a = new Person("sun", 45);
        Person b = new Person("haor", 90);
        Person c = new Person("gafa", 56);
        Person d = new Person("jfg", 45);
        Person e = new Person("dfh", 789);

        //添加元素到集合
        ArrayList<Person> people = new ArrayList<>();
        Collections.addAll(people, a, b, c, d, e);

        //排序
        Collections.sort(people);
        System.out.println(people);
     }
}
