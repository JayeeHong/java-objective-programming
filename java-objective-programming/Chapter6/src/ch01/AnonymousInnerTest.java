package ch01;

class Outer2 {
    int outNum = 100;
    static int sNum = 200;

    // Runnable : 클래스를 스레드화할 때 사용
    Runnable getRunnable(int i) {
        int num = 10;

        /*class MyRunnable implements Runnable {
            int localNum = 1000;

            @Override
            public void run() {
                //Variable 'num' is accessed from within inner class, needs to be final or effectively final
//                i = 50;
//                num = 20;

                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outer2.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
            }
        }

        return new MyRunnable();*/

        // 익명클래스 1
        return new Runnable() {
            int localNum = 1000;

            @Override
            public void run() {
                //Variable 'num' is accessed from within inner class, needs to be final or effectively final
//                i = 50;
//                num = 20;

                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outer2.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
            }
        };
    }

    // 익명클래스2
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable class");
        }
    };
}

public class AnonymousInnerTest {
    public static void main(String[] args) {
        Outer2 out = new Outer2();
        Runnable runner = out.getRunnable(100);

        runner.run();

        out.runnable.run();
    }
}
