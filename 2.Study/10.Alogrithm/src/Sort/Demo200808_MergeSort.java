package Sort;

public class Demo200808_MergeSort {
    public static void main(String[] args) {

    }

    public static int[] sortArray(int[] nums) {
          if (nums==null || nums.length<2){
              return null;
          }
        return null;
    }
    public static void process(int[] nums,int L ,int R){
        if (L==R){
            return;
        }
        int mid=L+((R-L)>>1);
        process(nums,L,mid);
        process(nums,mid+1,R);
    }

    public static void merge(int[] nums,int L,int R,int mid){
        int p1=L;
        int p2=mid+1;
        int[] help = new int[R-L+1];
        int i=0;

        while(p1<=mid && p2<=R){
            help[i++]=nums[p1]<=nums[p2]?nums[p1++]:nums[p2++];
        }
        while(p1<=mid){
            help[i++]=nums[p1++];
        }
        while(p2<=R){
            help[i++]=nums[p2++];
        }

        for (int j = 0; j < help.length; j++) {
            nums[L+j]=help[j];
        }
    }
}
