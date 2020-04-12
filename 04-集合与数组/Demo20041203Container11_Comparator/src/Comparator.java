import java.util.ArrayList;
import java.util.Collections;

public class Comparator {
    public static void main(String[] args) {
        Student a = new Student("sun", 45);
        Student b = new Student("a", 90);
        Student c = new Student("g", 90);
        Student d = new Student("jfg", 45);
        Student e = new Student("dfh", 21);

        //添加元素到集合
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list, a, b, c, d, e);

        //排序
        Collections.sort(list,new Student());
        System.out.println(list);
        System.out.println("====================");
        //方式二：
        //方式一还是在相应的类进行修改，看起来还是太麻烦了，我们采用匿名内部类做，会好看很多
        Collections.sort(list, new java.util.Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getName()=="g"){
                    return 1;
                }
                else{
                    return 0;
                }
            }
        });
        System.out.println(list);
    }
}
