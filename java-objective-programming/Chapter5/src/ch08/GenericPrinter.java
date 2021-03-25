package ch08;

public class GenericPrinter<T extends Material> { //T extends Material : T에 제한을 둠 (T는 Material 로만 사용)
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material.toString();
    }
}
