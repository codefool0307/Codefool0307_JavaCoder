import java.util.*;
import java.math.*;

public class Main {
    static int bound=1000000;
    static int[] tr=new int[bound+2];
    static void inc(int u){
        for (;u<=bound;u+=u&-u)
            ++tr[u];
    }
    static int sum(int u){
        int w=0;
        for (;u>0;u-=u&-u)
            w+=tr[u];
        return w;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n + 2];
        for (int i = 1; i <=n; ++i) {
            a[i]=scanner.nextInt();
        }
        for (int i = 0; i <=bound; ++i) {
           tr[i]=0;
        }
        int[] f=new int[n+2];
        for (int i = 1; i <=n ; ++i) {
            f[i]=sum(a[i]);
            inc(a[i]);
        }
        for (int i = 0; i <=bound; ++i) {
            tr[i]=0;
        }
        int[] g=new int[n+2];
        for (int i = n; i >0; --i) {
            g[i]=n-i-sum(a[i]-1);
            inc(a[i]);
        }
        long ans=0;
        for (int i = 1; i <=n; ++i) {
            ans+=(long)(f[i]*(long)(g[i]));
        }
        System.out.println(ans);
    }
}
