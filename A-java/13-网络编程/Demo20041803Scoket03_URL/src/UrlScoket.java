import java.net.MalformedURLException;
import java.net.URL;

public class UrlScoket {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://codefool0307.github.io/JavaScholar/#/4.algorithm/9-%E6%8E%92%E5%BA%8F?id=_961-%e8%8d%b7%e5%85%b0%e5%9b%bd%e6%97%97%e9%97%ae%e9%a2%98");
            //1.获取协议名
            String protocol = url.getProtocol();
            System.out.println(protocol);
            //2.获取主机名
            String host = url.getHost();
            System.out.println(host);
            //3.获取端口号
            int port = url.getPort();
            System.out.println(port);
            //4.获取查询名
            String query = url.getQuery();
            System.out.println(query);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }finally {
            System.out.println("程序运行结束了");
        }

    }
}
