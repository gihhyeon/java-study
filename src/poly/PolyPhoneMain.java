package poly;

public class PolyPhoneMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        Phone phone = new Phone();
        phone.call();
        phone.message();
        System.out.println();

        // 자식 변수가 자식 인스턴스 참조
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.internet();
        smartPhone.playGame();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Phone poly = new SmartPhone(); // 자식 인스턴스를 생성했기 때문에 메모리 상에 SmartPhone과 Phone이 모두 생성됨.
        poly.call();

        //SmartPhone smartPhone1 = new Phone(); 자식은 부모를 담을 수 없음.

        //자식의 기능도 호출 불가. 컴파일 오류 발생.
    }
}
