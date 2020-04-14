import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class Object {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        oos.writeObject(new Person("sun",23));
        oos.flush();
    }
}
