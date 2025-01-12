package lambda;

//람다식 변수 할당
public class LambdaMain1 {

    public static void main(String[] args) {
        IAdd lambda = (a, b) -> a + b; // 함수를 변수에 할당
        lambda.add(1, 2); // 함수 사용
    }
}
