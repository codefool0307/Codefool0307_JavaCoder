public class Test {
    public static void main(String[] args) {
        //1.不使用toString方法
        Person p1 = new Person();
        p1.setAge(24);
        p1.setName("sage");
        System.out.println("姓名："+p1.getName()+"年龄："+p1.getAge());

        //2.使用toString方法
        Person p2 = new Person("wuhan", 45);
        Person p3 = new Person("wuhan", 45);
        System.out.println(p2.toString());
        System.out.println(p2.equals(p3));
    }
}
