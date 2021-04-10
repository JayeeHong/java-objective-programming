package ch03;

public class MyNumberTest {
    public static void main(String[] args) {
        MyNumber myNumber = (num1, num2) -> {
            if(num1 > num2) return num1;
            else return num2;
        };

        MyNumber myNumber2 = (num1, num2) -> num1 > num2 ? num1 : num2;

        System.out.println(myNumber.getMax(10, 20));
        System.out.println(myNumber2.getMax(22, 33));
    }
}
