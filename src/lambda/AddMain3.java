package lambda;

public class AddMain3 {

    public static void main(String[] args) {
        // 람다 표현식으로 함축
        IAdd lambda = (a, b) -> {return a + b;};

        int result3 = lambda.add(1, 2);
        System.out.println(result3);

        System.out.println(lambda);
    }
}
