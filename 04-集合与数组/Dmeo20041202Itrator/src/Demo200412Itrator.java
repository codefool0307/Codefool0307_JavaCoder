import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo200412Itrator {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        //遍历集合
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

    }
}
