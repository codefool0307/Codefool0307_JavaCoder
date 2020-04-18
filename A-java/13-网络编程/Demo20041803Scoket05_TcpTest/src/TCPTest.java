import org.junit.Test;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class TCPTest {
    @Test
    public void Client() throws IOException {
            //1.创建Scoket
            Socket socket = new Socket("127.0.0.1",9833);
            //2.打开链接，是放到服务端，也就是输出
            OutputStream os = socket.getOutputStream();
            //3.读写操作
            //3.1先读取照片
            FileInputStream fis = new FileInputStream(new File("dog.jpg"));
            //3.2 写数据
            byte[] bytes = new byte[1024];
            int len=0;
            while ((len=fis.read())!=-1){
                os.write(bytes,0,len);
            }
            socket.shutdownOutput();
            //4.接收服务器的回传数据
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream bs = new ByteArrayOutputStream();
        byte[] bytes1 = new byte[1024];
        int len1;
        while ((len1=is.read(bytes1))!=-1){
            bs.write(bytes,0,len1);
        }
        System.out.println(bs.toString());
    }
    @Test
    public void Server() throws IOException {
        //1.创建套接字
        ServerSocket ss = new ServerSocket(9833);
        //2.链接请求
        Socket accept = ss.accept();
        //3.接收一下Scoket内容
        InputStream is = accept.getInputStream();
        //4.写数据，并把他存在一个位置
        FileOutputStream fos = new FileOutputStream(new File("dog2.jpg"));
        //4.1.写数据
        byte[] bytes = new byte[1024];
        int len=0;
        while ((len=is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        //5. 服务器回传数据到客户端
        OutputStream os = accept.getOutputStream();
        os.write("收到单身狗图片一张".getBytes());
    }
}
