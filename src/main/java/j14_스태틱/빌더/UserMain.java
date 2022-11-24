package j14_스태틱.빌더;

public class UserMain {

    public static void main(String[] args) {

        User user = User.builder() // . = 주소, builder 스태틱 메소드
                .email("jihyeon@dfgdfg.com")
                .name("임지현")
                .username("jihyeon")
                .password("1234")
                .build();

        System.out.println(user);

    }

}
