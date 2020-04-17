import java.util.function.Consumer;
public class Consumer01 {
    public static void main(String[] args) {
        getString("hello",(s)->{
                        System.out.println(s.toUpperCase());},
                    (t)->{
                        System.out.println(t.toLowerCase());
                    });
    }
    public static void getString(String name, Consumer<String> con1,
                                               Consumer<String> con2){
        con1.andThen(con2).accept(name);
        //作用等同于con1.accept（name），con2.accept(name)
    }
}
