import java.util.Date;
public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        long time = date.getTime();
        String s = date.toString();
        System.out.println(time);
        System.out.println(s);

        Date date1 = new Date(839579437);
        long time1 = date1.getTime();
        System.out.println(time1);
        String s1 = date1.toString();
        System.out.println(s1);

        //sql的时间类
        java.sql.Date date2 = new java.sql.Date(739854729);
        System.out.println(date2.toString());

        //如何将java.util.Date对象转换为java.sql.Date对象
        java.sql.Date date3 = new java.sql.Date(date.getTime());
        System.out.println(date3);

    }
}
