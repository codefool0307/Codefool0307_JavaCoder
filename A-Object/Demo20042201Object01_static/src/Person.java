public class Person {
    public String name;
    public static String sentence="静态变量";
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //非静态代码块
    {
        System.out.println("Nonstatic-2");
        System.out.println(sentence);
        System.out.println(age);
    }
    {
        System.out.println("Nonstatic-1");
    }

   //静态代码块
    static{
       System.out.println("static-1");
        System.out.println(sentence+"，静态代码块一");
        sleep();
    }
    static{
        System.out.println("static-2");
    }
    public void eat(){System.out.println("我爱吃饭，我是非静态的"); }
    public static void sleep(){System.out.println("我是静态方法sleep"); }
    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}'; }

}
