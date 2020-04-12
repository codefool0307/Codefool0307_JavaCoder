public class ArrayFor {
    public static void main(String[] args) {
       int[] array={1,3,4,5,67,8,990,2534,4,57,35,3253,5456,34,6,37,564,457,45,34225};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------");
        for (int i : array) {
            System.out.print(i+"\t");
        }
    }
}
