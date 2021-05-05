package ch09;

public class AutoCloseTest {
    public static void main(String[] args) {

        AutoClosableObj obj = new AutoClosableObj();

        try (obj) {
            throw new Exception(); //예외 처리를 해줬기 때문에 프로그램이 abort 되지 않음
            // try~catch~finally 사용하는 것보다 깔끔함
            // java7에서부터 제공되는 Auto Closable 기능임
        } catch (Exception e) {
            System.out.println("exception");
        }

        System.out.println("end");
    }
}
