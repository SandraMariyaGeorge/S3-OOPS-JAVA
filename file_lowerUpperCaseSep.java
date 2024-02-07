//Write a java program to create two child threads. .One child thread should write all lowercase letters
//contained in file f1.txt to f2.txt and second child thread should write all upper case letters contained  in file f1.txt to f3.txt.

import java.io.*;

class Lower extends Thread {
    public void run() {
        int i;
        char ch;
        try {
            FileInputStream fis = new FileInputStream("f1.txt");
            FileOutputStream fos = new FileOutputStream("f2.txt");
            do {
                i = fis.read();
                if (i != -1) {
                    ch = (char) i;
                    if (ch >= 'a' & ch <= 'z')
                        fos.write(i);
                }
            } while (i != -1);
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

class Upper extends Thread {
    public void run() {
        int i;
        char ch;
        try {
            FileInputStream fis = new FileInputStream("f1.txt");
            FileOutputStream fos = new FileOutputStream("f3.txt");
            do {
                i = fis.read();
                if (i != -1) {
                    ch = (char) i;
                    if (ch >= 'A' & ch <= 'Z')
                        fos.write(i);
                }
            } while (i != -1);
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

class file_lowerUpperCaseSep {

    public static void main(String arg[]) {
        Lower l = new Lower();
        l.start();
        Upper u = new Upper();
        u.start();
    }
}