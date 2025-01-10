package extends1;

public class K5 extends Car {

    int price = 50000;

    @Override
    public void move() {
        System.out.println("자식 자동차 이동");
    }

    public void call() {
        System.out.println("자식 price = " + this.price);
        System.out.println("부모 price = " + super.price);

        this.move();
        super.move();
    }




}
