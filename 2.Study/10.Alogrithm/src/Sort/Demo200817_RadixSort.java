package Sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Demo200817_RadixSort {
    public static void main(String[] args) {
        new Scanner()
        HashMap<Integer, Integer> next = new HashMap<>();
        int[] arr = {22,21,32,31,1,100};
        //System.out.println(maxbits(arr));
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = n-1; i >=0 ; i--) {
            if (dp.containsKey(next.get(nums[i]))){
                dp.put(nums[i],dp.get(nums[i])+1);
            }
            else{
                dp.put(nums[i],1);
            }
            maxlen=Math.max(maxlen,dp.get(nums[i]));
        }
        return n-maxlen;
    }

    public static void sort(int[] arr){
        if (arr == null || arr.length < 2) {
            return;
        }
        RadixSort(arr,0,arr.length-1,maxbits(arr));
    }

    public static void RadixSort(int[] nums,int L,int R,int digit){
        final int radix=10;

        //桶，放置最后的元素
        int[] bucket = new int[R - L + 1];

        int i=0;
        int j=0;

        //开始对数值每一位进行遍历
        for (int d = 1; d <= digit ; d++) {

            int[] count = new int[radix];
            //首先对个位/十位/。。进行计数统计
            for (i = L; i <= R; i++) {
                j = getDigit(nums[i], d);
                count[j]++;
            }

            //判断出<=序号的元素个数
            for (i = 1; i <radix; i++) {
                count[i]=count[i]+count[i-1];
            }

            //开始遍历数组
            for (i = R; i >= L; i--) {
                j = getDigit(nums[i], d);
                bucket[count[j]-1] = nums[i];
                count[j]--;
            }

            for (i = L,j=0; i <=R; i++,j++) {
                nums[i]=bucket[j];
            }

        }
    }

    public static int getDigit(int x,int d){
        return ((x/(int)(Math.pow(10,d-1)))%10);
    }

    public static int maxbits(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int res = 0;
        while (max != 0) {
            res++;
            max /= 10;
        }
        return res;
    }
}


