/*
*    一个数组中两种数出现了奇数次，
*            其它数出现了偶数次，怎么找得到这个数呢？
*    思路：
*         第二个数，定义为b；第一个数定义为a。第一个数还是比较容易得到的，继续延续XOR01的思路
*         那么eor=a^b在二进制中一定会在某位上出现1，不好说是谁产生的，
*         那么eor在某个位上是1，假设a在该位=1，我就挨个找arr中是数与你相同并且奇数次（找兄弟过程）
*         剩下的数就好找了
*       还有个问题，你找这个1，怎么找？有个技巧
*/
public class Demo20200728_XOR02 {
    public static void main(String[] args) {
        int[] arr2 = { 4, 3, 4, 2, 2, 2, 4, 1, 1, 1, 3, 3, 1, 1, 1, 4, 2, 2 };
        XOR02(arr2);
    }
  public static void XOR02(int[] arr){
    if(arr==null || arr.length<2){
        return;
    }
    int eor=0;
      for (int i : arr) {
          eor^=i;
      }
    //提取某位数为1（提取最右侧为1的数）
      int tiqu=eor&(~eor+1);

      int eor1=0;

      for (int j : arr) {
          if ((j & tiqu) == 1){
              eor1^=j;
          }
      }
      System.out.println("第一个数"+eor1+"第二个数"+(eor^eor1));
  }
}
