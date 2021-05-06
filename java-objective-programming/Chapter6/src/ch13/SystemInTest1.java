package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest1 {
    public static void main(String[] args) {

        System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요.");

        int i;

        try {
            //InputStreamReader : byte 단위 문자를 입력받을 수 있다. (한글 안깨짐)
            //System.in.read() : byte 단위로 읽음 (한글 깨짐)
            InputStreamReader isr = new InputStreamReader(System.in);
            while((i = isr.read()) != '\n') {
                System.out.println(i);
                System.out.println((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
