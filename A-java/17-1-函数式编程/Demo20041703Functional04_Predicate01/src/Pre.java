import java.util.ArrayList;
import java.util.function.Predicate;
public class Pre {
    public static void main(String[] args) {
        String[] arr={"迪丽热巴,nv","刘德华,男","谢霆锋帅,男"};
        check(arr,(s)->{
            Boolean a=s.split(",")[0].length() > 3;
            return a;
        }, (t)->{
            Boolean b=t.split(",")[1].contains("男");
        return b;
    });

    }
    public static void check(String[] arr, Predicate<String> str1,
                             Predicate<String> str2){
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean test = str1.and(str2).test(s);
            if (test){
                list.add(s);
            }
        }
        System.out.println(list);
    }
}
