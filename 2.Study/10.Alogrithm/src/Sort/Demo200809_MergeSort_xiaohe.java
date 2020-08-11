package Sort;
public class Demo200809_MergeSort_xiaohe {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,5};
        int i = mergesort(arr);
        System.out.println(i);
    }

    public static int mergesort(int[] nums){
        if (nums==null || nums.length<2){
            return 0;
        }
       return process(nums,0,nums.length-1);
    }
    public static int process(int[] nums,int L,int R){
       if (L==R){
           return 0;
       }
       int mid=L+((R-L)>>1);
       return process(nums,L,mid)+process(nums,mid+1,R)+merge(nums,L,R,mid);
    }
    public static int merge(int[] nums,int L,int R,int mid){
        int p1=L;
        int p2=mid+1;
        int i=0;
        int[] help = new int[R-L+1];
        int res=0;

        while(p1<=mid && p2<=R){
            //因为左侧指针<右侧指针，那么左侧指针<右侧所有的数
            //为什么呢？因为层级排序中，底层已经排序完成了，
            //比如说 7 2 3 6 8 3 4 9
            //  7 2 3 6 ---->  7 2  和   3  6 ----> 7和2    3和6
            //这样7与2比较 7比2大，不用，没有小和，交换
            //3和6,3<6,那么3与6就不进行交换了
            //一次进行递增就好了
         res += nums[p1]<nums[p2]?(R-p2+1)*nums[p1]:0;
         help[i++]=nums[p1]<nums[p2]?nums[p1++]:nums[p2++];
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
        return res;
    }
}
