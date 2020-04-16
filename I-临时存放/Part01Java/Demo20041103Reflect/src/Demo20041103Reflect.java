public class Demo20041103Reflect {
    public static void main(String[] args) throws ClassNotFoundException {
        //方式一：全类名
        Class a = Class.forName("Person");

        //方式二：类名
        Class b = Person.class;

        //方式三：对象获取
        Person c = new Person();
        Class c1 = c.getClass();

        System.out.println(a==b);
        System.out.println(b==c1);
        System.out.println(a==c1);
    }
}
