import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test {
    public static void main(String[] args) {
        //相当于无参构造
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
        System.out.println("--------------------------------");
        //相当于有参构造
        LocalDateTime ldt = LocalDateTime.of(2002, 07, 03, 12, 45);
        System.out.println(ldt);
        System.out.println("--------------------------------");
        //常用方法：
        int dayOfMonth = ldt.getDayOfMonth();
        int dayOfYear = ldt.getDayOfYear();
        Month month = ldt.getMonth();
        System.out.println(month);
        System.out.println(dayOfMonth);
        System.out.println(dayOfYear);

    }
}
