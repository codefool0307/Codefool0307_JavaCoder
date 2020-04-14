import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("大哥",23);
        map.put("二哥",45);
        //获取map集合中的键
        Set<String> set = map.keySet();
        //方式一：增强for循环
        for (String key : set) {
            Integer value = map.get(key);
            System.out.println(key+"----"+value);
        }
        //方式二：迭代器
        Iterator<String> it = set.iterator();//使用迭代器必须使用这个
        while (it.hasNext()){
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key+"--------"+value);
        }

    }
}
