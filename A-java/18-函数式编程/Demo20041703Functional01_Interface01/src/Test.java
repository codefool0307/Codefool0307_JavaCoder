public class Test {
    public static void main(String[] args) {
        //多态展示
        method(new MyFunctionImpl());
        //匿名内部类
        method(new MyFunction() {
            @Override
            public void show2(String str) {
                System.out.println(str);
            }
        });
        //函数式编程
        method((m)-> System.out.println(m));

    }
    public static void method(MyFunction m){
        m.show2("大哥让我来巡山了");
    }
}
