import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("大哥",23);
        map.put("二哥",45);
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        //方式一；增强for循环
        for (Map.Entry<String, Integer> map1 : set) {
            String key = map1.getKey();
            Integer value = map1.getValue();
            System.out.println(key+"----"+value);
        }
        //方式二：迭代器
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<String, Integer> map1 = it.next();
            String key = map1.getKey();
            Integer value = map1.getValue();
            System.out.println(key+"----"+value);
        }
    }

}
