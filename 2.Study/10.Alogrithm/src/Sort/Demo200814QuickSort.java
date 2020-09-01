package Sort;

import java.util.Arrays;

public class Demo200814QuickSort {
    public static void main(String[] args) {
        int[] arr={3,6,1,4,4,6,2,8,3,8,10};
        //quicksort(arr);
        //System.out.println(Arrays.toString(arr));
        /*quick_01(arr,0,arr.length-1,4);
        System.out.println(Arrays.toString(arr));*/
    }

    public static void quicksort(int[] nums){
        if (nums ==null || nums.length<2){
            return;
        }
        process(nums,0,nums.length-1,4);
    }

    public static void process(int[] nums,int L ,int R,int p){
        if (L<R){
            int[] a = quick_01(nums,L,R,p);
            process(nums,L,a[0]-1,p);
            process(nums,a[1]+1,R,p);
        }

    }

    public static int[] quick_01(int[] nums,int L,int R,int p){
        int less=L-1;
        int more=R+1;
        int index=L;
        while(index<more){
            if (nums[index]<p){
                swap(nums,index++,++less);
            }
            if (nums[index]>p){
               swap(nums,index,--more);
            }else{
                index++;
            }
        }
        return new int[]{less+1,more-1};
    }

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
