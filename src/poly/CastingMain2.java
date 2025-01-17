package poly;

public class CastingMain2 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Phone poly = new SmartPhone();

        //해당 메서드를 호출하는 순간만 다운캐스팅
        ((SmartPhone) poly).playGame();
    }
}
