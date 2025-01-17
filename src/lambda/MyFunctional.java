package lambda;

@FunctionalInterface // 두 개 이상의 메소드 선언 신 컴파일 오류를 발생시켜줌
public interface MyFunctional {
    public void method();

 //   public void otherMethod(); // 컴파일 오류 발생

}
