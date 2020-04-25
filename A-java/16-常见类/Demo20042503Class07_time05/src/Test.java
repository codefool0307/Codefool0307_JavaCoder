import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class Test {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        Instant instant1 = Instant.ofEpochMilli(6528365);
        System.out.println(instant1);

        OffsetDateTime odt = instant1.atOffset(ZoneOffset.ofHours(7));
        System.out.println(odt);
    }
}
