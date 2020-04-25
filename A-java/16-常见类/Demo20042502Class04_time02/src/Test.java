import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        //1.默认模式来进行创建
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        String format = sdf.format(date);
        System.out.println(format);

        //2.指定模式来进行创建
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 EEE:HH:mm:ss");
        String format1 = sdf2.format(date);
        System.out.println(format1);

        //3.指定日期解析
        try {
            Date date1 = sdf2.parse("2014年08月09日 星期一:09:08:02");
            String s = date1.toString();
            System.out.println(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
