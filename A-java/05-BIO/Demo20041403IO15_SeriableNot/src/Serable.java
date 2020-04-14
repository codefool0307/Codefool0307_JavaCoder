import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        Person o = (Person) ois.readObject();
        ois.close();
        System.out.println(o.getAge()+"-----"+o.getName());
    }
}
