public class Test {
    public static void main(String[] args) {
        Generic<String> g1 = new Generic<String>();
        g1.setName("12");
        String name = g1.getName();
        System.out.println(name);
    }
}
