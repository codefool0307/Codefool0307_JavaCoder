import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
public class Test {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String format = dtf.format(now);
        System.out.println(format);

        TemporalAccessor parse = dtf.parse("2019-02-18 11:42:18");
        System.out.println(parse);
    }
}
