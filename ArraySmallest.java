import java.util.*;

public class ArraySmallest {

    public static void main(String[] args) {

        sumWithoutSmallest();
    }

    public static int sumWithoutSmallest() {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }
        int smallestNum = Integer.MAX_VALUE;
        int sum = 0;
        for (int i : numbers) {
            if (smallestNum > i)
                smallestNum = i;
            sum = sum + i;
        }
        sum = sum - smallestNum;
        System.out.println(sum);
        return sum - smallestNum;
    }
}
