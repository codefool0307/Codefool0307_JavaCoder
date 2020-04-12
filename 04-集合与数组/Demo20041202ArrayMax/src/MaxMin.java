public class MaxMin {
    public static void main(String[] args) {
        int[] array={1,3,4,5,67,8,990,2534,4,57,35,3253,5456,34,6,37,564,457,45,34};
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if (max<array[i]){
                max=array[i];
            }
        }
        System.out.println(max);
    }
}
