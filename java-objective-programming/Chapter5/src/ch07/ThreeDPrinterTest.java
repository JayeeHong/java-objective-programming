package ch07;

public class ThreeDPrinterTest {
    public static void main(String[] args) {
        Powder powder = new Powder();
        ThreeDPrinter3 printer = new ThreeDPrinter3();

        printer.setMaterial(powder);

        Powder p = (Powder) printer.getMaterial();
        // -> 이런식으로 일일이 형변환 하는것이 번거롭다 -> Generic 방식 사용
    }
}
