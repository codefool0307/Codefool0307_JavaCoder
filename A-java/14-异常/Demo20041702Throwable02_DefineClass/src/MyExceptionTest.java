import java.util.Scanner;
public class MyExceptionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int i = sc.nextInt();
        try{
            regist(i);
        }catch (MyException e){
            System.out.println("范围不对"+e.getIdnumber());
        }finally {
            System.out.println("本次登记结束");
        }
    }
    public static void regist(int str) throws MyException{
        if (str<0){
            throw new MyException("不在范围内，输入的是：",str);
        }else{
            System.out.println("登记成功"+str);
        }
    }
}
