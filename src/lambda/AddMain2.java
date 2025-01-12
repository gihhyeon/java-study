package lambda;

public class AddMain2 {

    public static void main(String[] args) {
        // 익명 클래스로 정의해서 사용하기(일회용)
        IAdd a = new Add() {
            public int add(int a, int b) {
                return a + b;
            }
        };

        int result2 = a.add(1, 2);
        System.out.println(result2);
    }
}
