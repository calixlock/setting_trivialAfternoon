package array.branch;

public class BreakIteration {
    public static void main(String[] args) {
        System.out.println("break, continue");

        // for문에서 break
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 5) {
                break; // 조건 만족시 for문 빠져나옴
            } else {
                System.out.println(numbers[i]);
            }
        }

        // for문에서 continue
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                continue; // 조건 만족시 pass
            } else {
                System.out.println(numbers[i]);
            }
        }
    }
}
