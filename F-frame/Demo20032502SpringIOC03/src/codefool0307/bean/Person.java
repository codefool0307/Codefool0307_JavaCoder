package codefool0307.bean;
import java.util.List;
public class Person {
    private String lastName;
    private Integer age;

    private Car car;
    private List<Car> books;

    public Person() { }
    public Person(Car car) {
        this.car = car;
        System.out.println("可以为car赋值的有参构造器....");
    }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
    public Car getCar() { return car; }
    public void setCar(Car car) { this.car = car; }
    public List<Car> getBooks() { return books; }
    public void setBooks(List<Car> books) { this.books = books; }
    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", car=" + car +
                ", books=" + books +
                '}';
    }
}
