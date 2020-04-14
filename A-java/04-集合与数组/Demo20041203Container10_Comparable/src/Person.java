public class Person implements java.lang.Comparable<Person> {
    private String name;
    private int age;
    public Person() {}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    @Override
    //改写方式一：
    public int compareTo(Person o) {
        if (this.getAge()<o.getAge()){
            return -1;
        }
        if (this.getAge()==o.getAge()){
            return 0;
        }
        else{
            return 1;
        }
        //改写方式二：
        //return this.getAge()-o.getAge();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
