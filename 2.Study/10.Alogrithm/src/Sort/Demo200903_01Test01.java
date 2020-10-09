package Sort;

import java.util.*;
import java.util.function.DoubleToIntFunction;

public class Demo200903_01Test01 {
    public static void main(String[] args) {

    }

    public static void namesort(HashMap<Integer, String> map){
        Integer key=null;
        List<Integer> list=null;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            key = (Integer)entry.getKey();
            list = Arrays.asList(key);
        }

    }
    public static void input(){



    }
}
