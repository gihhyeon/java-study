package array;

/**
 * 배열을 역순으로 순회하면서 인덱스를 감소 혹은 증가하여 새로운 배열에 대입
 */
public class ReversedArray3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversedArr = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = arr[i];
        }

        for (int i : reversedArr) {
            System.out.print(i + " ");
        }
    }
}
