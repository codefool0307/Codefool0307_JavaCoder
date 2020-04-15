import java.util.ArrayList;
import java.util.List;
public class Test {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);

        List<?> list2 = new ArrayList<>();
        list2.add(null);
        //list2.add(3);
    }
}
