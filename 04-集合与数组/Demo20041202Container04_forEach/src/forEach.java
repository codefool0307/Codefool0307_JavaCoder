import java.io.Serializable;
import java.util.stream.Stream;

public class forEach {
    public static void main(String[] args) {
        Stream stream = Stream.of("1", 3, 34.67, '2');
        stream.forEach((t)->{
            System.out.println(t);
        });
    }
}
