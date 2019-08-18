import java.io.*;

public class JavaFileTest {
    public static void main(String[] args) throws IOException {
        //Writing to a file

        File f = new File("demo.txt");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("Hello this is written to the file ...");
        fos.close();
        dos.close();

        //Reading from a file

        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        String fromFileString = dis.readUTF();
        System.out.println("File Data is : =======>  " + fromFileString);
        fis.close();
        dis.close();
    }
}
