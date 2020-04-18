import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class test {
    @Test
    public void Client(){
        Socket socket =null;
        OutputStream os=null;
        try {
            //1.创建Scoket
            socket = new Socket("127.0.0.1", 9989);
            //2.打开链接到Scoket输入输出流
            os = socket.getOutputStream();
            //3.写数据
            os.write("大王让我来巡上".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void Server(){
        ServerSocket serverSocket =null;
        Socket accept =null;
        InputStream is =null;
        ByteArrayOutputStream bs =null;
        //1.创建服务端ServerScoket
        try {
            serverSocket = new ServerSocket(9989);
            //2.链接客户端的scoket
            accept = serverSocket.accept();
            //3.获取输入流
            is = accept.getInputStream();
            //读取输入流的数据
            bs = new ByteArrayOutputStream();
            byte[] bytes = new byte[1024];
            int len=0;
            while ((len=is.read())!=-1){
                bs.write(bytes,0,len);
            }
            System.out.println(bs.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (serverSocket!=null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bs!=null){
                try {
                    bs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (accept!=null){
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
