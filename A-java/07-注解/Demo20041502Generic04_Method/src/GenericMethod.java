public class GenericMethod {
    public <T> T method(T name){
        return name;
    }
    public static <T> void method1(T name){
        System.out.println(name);
    }
}
