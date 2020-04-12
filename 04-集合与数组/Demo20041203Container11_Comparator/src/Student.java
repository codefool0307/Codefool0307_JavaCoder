import java.util.Comparator;

public class Student implements Comparator<Student> {
    private String name;
    private int age;
    public Student() {}
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge()<o2.getAge()){
            return -1;
        }
        if (o1.getAge()==o2.getAge()){
            return 0;
        }
        else{
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
