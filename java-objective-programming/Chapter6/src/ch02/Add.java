package ch02;

@FunctionalInterface //FunctionalInterface : method를 두 개 이상 선언하면 안됨
public interface Add {
    public int add(int x, int y);
}
