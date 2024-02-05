import java.io.*;
class file_handling {

    public static void main(String arg[]) {
        int i;
        try {
            FileInputStream fis = new FileInputStream("ex1.txt");
            FileOutputStream fos = new FileOutputStream("ex2.txt");
            do {
                i = fis.read();
                if (i != -1) {
                    fos.write(i);
                }
            } while (i != -1);
            fis.close();
            fos.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}