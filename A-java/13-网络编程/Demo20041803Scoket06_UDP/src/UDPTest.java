

import org.junit.Test;

import java.io.IOException;
import java.net.*;

public class UDPTest {
    @Test
    public void sender() throws IOException{
        DatagramSocket socket = new DatagramSocket();

        String str="学好java基础很重要";
        byte[] bytes = str.getBytes();
        InetAddress localHost = InetAddress.getLocalHost();
        DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length, localHost, 8900);

        socket.send(packet);
        socket.close();
    }
    @Test
    public void receiver() throws IOException {
        DatagramSocket socket = new DatagramSocket(8900);

        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length);

        socket.receive(packet);
        System.out.println(new String(packet.getData(),0,packet.getLength()));
        socket.close();
    }
    }
