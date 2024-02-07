
//Write a java program to read a  string from a file  check whether a string is palindrome or not.
//if it is palindrome,count no of occurrence of each character and remove duplicate one’s and write in to another file.
import java.io.*;

class file_eg1 {
    public static void main(String[] args) {
        int i, j, k, l, m, count = 0;
        String s = "";
        String rstr = "";
        char ch;
        try {
            FileInputStream fin = new FileInputStream("f1.txt");
            FileOutputStream fop = new FileOutputStream("f2.txt");
            do {
                i = fin.read();
                if (i != -1) {
                    ch = (char) i;
                    s += ch;
                }
            } while (i != -1);
            int len = s.length();
            char ch2[] = new char[len];
            char ch1[] = new char[len];
            for (j = len - 1; j >= 0; j--) {
                rstr += s.charAt(j);
            }
            if (rstr.equals(s)) {
                ch1 = s.toCharArray();
                ch2 = s.toCharArray();
                for (i = 0; i <= len - 1; i++) {
                    count = 0;
                    for (j = 0; j <= len - 1; j++) {
                        if (ch1[i] == ch2[j]) {
                            count++;
                            ch2[j] = 'x';

                        }

                    }
                    if (count != 0) {
                        System.out.println(count + " " + ch1[i]);
                        k = (int) ch1[i];
                        l = (int) '\t';
                        m = (int) '\n';
                        fop.write(count);
                        fop.write(l);
                        fop.write(k);
                        fop.write(m);
                    }
                }
            }
            fin.close();
            fop.close();
        } catch (Exception e) {
        }
    }
}