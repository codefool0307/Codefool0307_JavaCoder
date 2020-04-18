import java.net.InetAddress;
import java.net.UnknownHostException;
public class IP01 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress adress1 = InetAddress.getByName("www.baidu.com");
        //获取网站的IP字符串
        byte[] address = adress1.getAddress();
        //获取网站的域名
        String hostName = adress1.getHostName();
        //获取网站的IP地址
        String hostAddress = adress1.getHostAddress();
        System.out.println(address);
        System.out.println(hostName);
        System.out.println(hostAddress);
        //获取本机的域名和IP地址
        InetAddress address2 = InetAddress.getLocalHost();
        System.out.println(address2);
    }
}
