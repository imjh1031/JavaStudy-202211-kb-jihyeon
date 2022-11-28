package doit_제네릭.ThreeDPrint;

public class GenericPrinter<T extends Material> { // T = type의 약자. 자료형 매개변수

    private T material; // T 자료형으로 선언한 변수

    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() { // T 자료형 변수 material을 반환하는 제네릭 메소드
        return material;
    }

    public String toString() {
        return material.toString();
    }

    public void printing() {
        material.doPrinting();
    }

}
