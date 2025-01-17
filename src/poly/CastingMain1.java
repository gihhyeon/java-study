package poly;

public class CastingMain1 {
    public static void main(String[] args) {
        Phone poly = new SmartPhone();
        //자식의 기능은 호출할 수 없다.
        //poly.internet();

        //다운캐스팅
        SmartPhone smartPhone = (SmartPhone) poly; // 부모 타입을 일시적으로 자식 타입으로 변경
        smartPhone.playGame();
    }
    /**
     * 캐스팅을 한다고 해서 SmartPhone smartphone의 타입이 변하는 것은 아님.
     * 해당 참조값을 꺼내고 꺼낸 참조값이 자식 타입이 되는 것이다.
     */
}
