package doit_제네릭.ThreeDPrint;

public class ThreeDPrinter {

    private Object material; // Object = 모든 클래스의 최상위 클래스

    public void setMaterial(Object material) {
        this.material = material;
    }

    public Object getMaterial() {
        return material;
    }

    public static void main(String[] args) {

        ThreeDPrinter printer = new ThreeDPrinter();

        Powder p1 = new Powder(); // 매개변수 자료형이 Object이므로 자동으로 형 변환 됨
        printer.setMaterial(p1);

        Powder p2 = (Powder)printer.getMaterial();
        // 반환형이 Object 클래스이며 Powder 자료형 변수를 반환받을 때는 반드시 형 변환을 해줘야 함
    }



}
