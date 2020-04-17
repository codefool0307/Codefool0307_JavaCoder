public class TryCatchFinally {
    public static void main(String[] args) {
        String[] str={"sun","hao","ran"};
        try{
            for (int i = 0; i < 5; i++) {
                System.out.println(str[i]);
            }
        }catch(Exception e){
            System.out.println("error");
            e.getMessage();
            e.printStackTrace();
        }finally{
            System.out.println("剩余程序");
            int i=3+4;
            System.out.println(i);
        }

    }
}
