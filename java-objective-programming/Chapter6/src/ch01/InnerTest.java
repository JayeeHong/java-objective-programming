package ch01;

class OutClass {
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;
    
    public OutClass() {
        inClass = new InClass();
    }

    private class InClass {
        int iNum = 100;

//        static int sInNum = 500; //에러

        void inTest() {
            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
        }
    }

    public void usingClass() {
        inClass.inTest();
    }
    
    //정적 내부 클래스
    static class InStaticClass {
        int iNum = 100;
        static int sInNum = 200;

        void inTest() {
            //외부 클래스의 인스턴스 변수는 사용할 수 없음
            System.out.println("InClass num = " + iNum + "(내부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
        }
        
        static void sTest() {
            //내부 클래스의 인스턴스 변수 사용할 수 없음
//            System.out.println("InClass num = " + iNum + "(내부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
        }
    }

}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.usingClass();

        /*
        //InClass가 private 아닐 때 문법적으로 쓸 수는 있다.
        OutClass.InClass inner = outClass.new InClass();
        inner.inTest();
        */

        System.out.println();

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();

        System.out.println();

        //정적 메소드는 바로 호출할 수 있다.
        OutClass.InStaticClass.sTest();
    }
}
