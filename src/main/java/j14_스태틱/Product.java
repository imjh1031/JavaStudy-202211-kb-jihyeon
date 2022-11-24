package j14_스태틱;

/*
    공유영역. static = 공유
    생성을 하지 않아도 메모리 영역에 있음
    공유되는 영역은 하나
 */

import lombok.Data;

@Data
public class Product {

    private static int autoIncrement = 20220000;

    private int serialNumber;
    private String name;

    public Product(String name) {
        this.serialNumber = ++autoIncrement; // 증가된 값을 새로운 곳에 할당함
        this.name = name;
    }

    public static void print() {
        System.out.println(autoIncrement);
        // System.out.println(serialNumber); 메모리 할당이 되어야 쓸 수 있음.
        // Product product = new Product("모니터");
        // System.out.println(product.getSerialNumber());
        Product product = new Product("아이폰");
        product.add(10, 20);
    }

    public int add(int a, int b) {
        return a + b;
    }

}
