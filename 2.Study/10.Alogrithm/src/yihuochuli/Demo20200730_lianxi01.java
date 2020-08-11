package yihuochuli;

import javax.lang.model.element.NestingKind;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Demo20200730_lianxi01 {
    public static void main(String[] args) {
        HashMap<Integer,String> chengji = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        for (int i = 0; i < 4; i++) {
            System.out.println("第"+(i+1)+"次输入");
            String next = scanner.next();
            String[] split = next.split(",");
            chengji.put(Integer.valueOf(split[1]), split[0]);
        }

        Set<Integer> set = chengji.keySet();
        int i=0;
        int[] ints = new int[4];
        //增强for循环方式
        for (Integer key : set) {
            //Integer value = chengji.get(key);
            ints[i]= key;
            i += 1;
        }

        sort01(ints);
        for (int j = 0; j < ints.length; j++) {
            System.out.println(ints[j]);
        }
        duiying(chengji,ints);

    }
    /*
      1. 对进入的数字的分数段进行获取
      2. 进行升序排序
      3. 进行升序排序
    */

    public static void duiying(HashMap chengji,int[] ints){
        for (int i = 0; i < ints.length; i++) {
            String integer = (String) chengji.get(ints[i]);
            System.out.println("姓名"+integer+"成绩"+ints[i]);
        }
    }

    public static void sort01(int[] ints){
        if (ints==null || ints.length<2){
            return;
        }
        for (int i = ints.length-1; i>0; i--) {
            for (int j = 0; j < i; j++) {
                if (ints[j]>ints[j+1]){
                   swap(ints,j,j+1);
                }
            }
        }
    }

    public static void sort02(int[] ints){
        if (ints==null || ints.length<2){
            return;
        }
        for (int i = ints.length-1; i>0; i--) {
            for (int j = 0; j < i; j++) {
                if (ints[j]<ints[j+1]){
                    swap(ints,j,j+1);
                }
            }
        }
    }

    public static void swap(int[] ints ,int a,int b){
         ints[a]=ints[a]^ints[b];
         ints[b]=ints[a]^ints[b];
         ints[a]=ints[a]^ints[b];
    }
}
