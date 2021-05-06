package ch16;

import java.io.*;

public class FileInputStreamReaderTest {
    public static void main(String[] args) {

        long millisecond = 0;

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"))) { //141ms 소요됨
        //try (FileInputStream fis = new FileInputStream("a.zip");
        //     FileOutputStream fos = new FileOutputStream(("copy.zip"))) { // 1바이트씩 읽는거라 오래걸림(62682ms 소요됨)

            millisecond = System.currentTimeMillis();

            int i;
            while ((i = bis.read()) != -1) {
                bos.write(i);
            }

            millisecond = System.currentTimeMillis() - millisecond;

        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println(millisecond + "ms 소요되었습니다.");

        //소켓 참고
        //Socket socket = new Socket();
        //BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        // socket.getInputStream() : 바이트 단위로 읽음
        // InputStreamReader : 문자 단위로 읽음 한글 가능
        // BufferedReader : 읽는 속도 향상
        //br.readLine();
    }
}
