

import java.io.*;

class displayFile {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("sample.txt");
            int a;
            while ((a = fin.read()) != -1) {
                char ch = (char) a;
                System.out.print(ch); 
            }
            fin.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e1) {
            System.out.println(e1);
        }
    }
}
