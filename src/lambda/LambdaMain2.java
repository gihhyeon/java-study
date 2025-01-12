package lambda;

// 람다식 매개변수 할당
// 메소드의 매개변수에 바로 입력값으로 넣는 방식
public class LambdaMain2 {

    public static void main(String[] args) {
        int n = result((a, b) -> a + b);
        System.out.println(n);
    }

    public static int result(IAdd lambda) {
        return lambda.add(1, 2);
    }
}
