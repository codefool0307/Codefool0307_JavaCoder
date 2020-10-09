package Sort;

import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n + 2];
        for (int i = 1; i <= n; ++i)
            a[i]=scanner.nextInt();
        Arrays.sort(a,1,n+1);
        for (int i = 0; i < m; ++i) {
            int k = scanner.nextInt();
            int L=1,R=n;
            while (L<=R){
                int mid=(L+R)/2;
                if (a[mid]<k)L=mid+1;
                else R=mid-1;
            }
            if (R==0||(L<=n && a[L]-k<k-a[R])) System.out.println(a[L]);
            else System.out.println(a[R]);
        }
    }
}
