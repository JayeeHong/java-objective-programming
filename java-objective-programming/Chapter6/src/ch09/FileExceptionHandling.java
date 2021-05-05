package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {
    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("a.txt");
            System.out.println("read");

        } catch (FileNotFoundException e) {
            System.out.println(e);
            //return;
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println("finally");
            }
            System.out.println("end");
        }

        System.out.println("======================================================");

        try (FileInputStream fis2 = new FileInputStream("a.txt")) {
            System.out.println("read");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");

    }


}
