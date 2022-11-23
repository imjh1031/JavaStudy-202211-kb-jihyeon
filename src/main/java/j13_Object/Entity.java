package j13_Object;

import lombok.*;

import java.util.Objects;

@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 모든 변수. 전체생성자
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data

public class Entity { // 정보를 담는 객체

    private String name;
    private int age;
    private String address;

    public boolean cmp() {
        return this.getClass() == Entity.class;
    }

}
