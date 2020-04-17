import java.util.function.Supplier;
public class Supplier01 {
    public static void main(String[] args) {
        int[] arr={1,2,4,67,45};
        getMax(()->{
            int max=arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (max<arr[i]){
                    max=arr[i];
                }
            }
            return max;
        });
    }

    public static void getMax(Supplier<Integer> sup){
        Integer integer = sup.get();
        System.out.println(integer);
    }
}
