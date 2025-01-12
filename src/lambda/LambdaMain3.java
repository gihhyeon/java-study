package lambda;

// 람다식 반환값 할당
public class LambdaMain3 {

    public static void main(String[] args) {
        IAdd func = makeFunction(); // 메서드의 반환값이 람다 함수
        int result = func.add(10, 20);
        System.out.println(result);
    }

    public static IAdd makeFunction() {
        return (a, b) -> a + b; // 반환값을 람다함수 자체를 리턴하도록 지정
    }
}
