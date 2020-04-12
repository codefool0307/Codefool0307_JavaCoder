import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("3");
        set.add("1");
        set.add("2");

        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
    }
}
