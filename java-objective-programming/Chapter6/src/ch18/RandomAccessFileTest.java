package ch18;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {

        RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");

        rf.writeInt(100);
        System.out.println("pos : " + rf.getFilePointer());
        rf.writeDouble(3.14);
        System.out.println("pos : " + rf.getFilePointer());
        rf.writeUTF("안녕하세요"); //modified utf-8 : 한글 3바이트로 처리, 문자는 null 끝에 붙는다 (2바이트)
        System.out.println("pos : " + rf.getFilePointer());

        rf.seek(0); //위치를 맨처음으로 지정

        int i = rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();

        System.out.println(i);
        System.out.println(d);
        System.out.println(str);
    }
}
