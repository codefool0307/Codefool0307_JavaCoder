import java.util.Calendar;
import java.util.Date;
public class Test {
    public static void main(String[] args) {
        //创建对象
        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();
        System.out.println(time);
        Date date = new Date(985379579725L);
        System.out.println(date);
        //把时间设置为这个之后，进行调动
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH,7);
        System.out.println(calendar.getTime());

    }
}
