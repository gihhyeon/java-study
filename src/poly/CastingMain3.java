package poly;

public class CastingMain3 {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        Phone phone1 = (Phone) smartPhone;
        Phone phone2 = smartPhone;

        phone1.call();
        phone2.message();
    }

    /**
     * 객체를 생성하면 해당 타입의 상위 부모 타입은 모두 함께 생성됨.
     * 업캐스팅은 메모리 상에 인스턴스가 모두 존재하기 때문에 항상 안전하게 캐스팅 생략 가능.
     * 다운캐스팅의 경우 인스턴스에 존재하지 않는 하위 타입으로 캐스팅하는 문제가 발생할 수 있음.
     * 그렇기 때문에 명시적으로 캐스팅해줘야 됨.
     */
}
