package array;

/**
 * 새로운 배열 생성
 */
public class ReverseArray2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }

        for (int num : reversedArr) {
            System.out.print(num + " ");
        }
    }
}
