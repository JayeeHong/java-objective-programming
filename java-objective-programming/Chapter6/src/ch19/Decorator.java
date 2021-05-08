package ch19;

public abstract class Decorator extends Coffee { //abstract : 상속을 위한 상위클래스로 쓰임

    Coffee coffee;

    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
    }
}
