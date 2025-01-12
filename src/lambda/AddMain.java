package lambda;

public class AddMain {

    public static void main(String[] args) {
        // 클래스로 메서드 사용하기
        Add a = new Add();

        int result = a.add(1, 2);
        System.out.println(result);
    }
}
