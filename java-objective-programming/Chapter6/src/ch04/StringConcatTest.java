package ch04;

public class StringConcatTest {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        //interface를 구현한 클래스 사용
        StringConcatImpl strImpl = new StringConcatImpl();
        strImpl.makeString(s1, s2);

        //람다식 사용
        StringConcat concat = (str1, str2) -> {
            System.out.println(s1 + "," + s2);
        };
        concat.makeString(s1, s2);

        //람다식 내부에선 아래처럼 익명클래스가 생성된다.
        StringConcat concat2 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + "..." + s2);
            }
        };
        concat2.makeString(s1, s2);
    }
}
