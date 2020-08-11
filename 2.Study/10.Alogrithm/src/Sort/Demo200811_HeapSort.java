package Sort;
import java.util.Arrays;
public class Demo200811_HeapSort {
    public static void main(String[] args) {
          int[] a={1,4,0,2,7};
        System.out.println(Arrays.toString(a));

        heapsort(a);

        System.out.println(Arrays.toString(a));

    }

    public static void heapsort(int[] nums){
        if (nums==null ||nums.length<2){
            return;
        }
         //变成大根堆
        for (int i = 0; i < nums.length; i++) {
            HeapInsert(nums,i);
        }
        //左右两个孩子怎么比较呢？
        int size=nums.length;
        swap(nums,0,--size);
        while (size>0){
            Heapify(nums,0,size);
            swap(nums,0,--size);
        }
    }


    //把数组排序成大根堆的形式
    public static void HeapInsert(int[] nums,int index){
        while (nums[index]>nums[(index-1)/2]){
            swap(nums,index,(index-1)/2);
            index=(index-1)/2;
        }

    }

    //数组中将头节点排除
    public static void Heapify(int[] nums,int index,int heapsize){
        int left=2*index+1;

        while(left<heapsize){
            //比较左右两个孩子哪个大哪个小
            int max=nums[left]<nums[left+1] && left+1<heapsize
                    ?left+1
                    :left;
            //那么较大值，就可以与父节点进行比较了
            max=nums[max]>nums[index]?max:index;

            //但是如果父子相等，那么退出就好了
            if (max==index) {break;}

            //然后比较完成后开始互换元素
            swap(nums,index,max);

            //这样连接起来
            index=max;     //看箭头方向确定左右侧
            left=2*index+1;
        }
    }

    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
