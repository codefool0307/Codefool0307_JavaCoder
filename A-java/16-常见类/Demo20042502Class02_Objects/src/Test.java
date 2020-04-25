import java.util.Objects;
public class Test {
    public static void main(String[] args) {
        String s1="aaaa";
        String s2="bbbb";
        String s3=null;
       /* boolean equals = s3.equals(s1);
        System.out.println(equals);*/
        boolean equals1 = Objects.equals(s3, s1);
        System.out.println(equals1);
    }
}
