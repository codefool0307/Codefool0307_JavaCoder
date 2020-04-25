public class test {
    public static void main(String[] args) {
        Person p1 = new Person("1", 18);
        int age = p1.age;
        System.out.println(age);
        //静态代码块执行
        Person.sleep();
        String sentence = Person.sentence;
        System.out.println(sentence);

    }
}
