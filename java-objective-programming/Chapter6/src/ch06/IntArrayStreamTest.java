package ch06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        for (int num : arr) {
            System.out.println(num);
        }

        System.out.println();
        IntStream is = Arrays.stream(arr);
        is.forEach(n -> System.out.println(n));

        // 스트림은 재사용 불가능. 스트림을 사용하려면 새로 생성해야 한다.

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}
