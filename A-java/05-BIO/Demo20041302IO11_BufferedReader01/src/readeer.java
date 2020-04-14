import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readeer {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("c.txt");
        BufferedReader br = new BufferedReader(fr);
        char[] chars = new char[1024];
        int len=0;
        while((len=br.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
    }
}
