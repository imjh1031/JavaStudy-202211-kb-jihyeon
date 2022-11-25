package j15_제네릭; // ? = 와일드카드

// Info<? extends people> getInfo() {
//        super students -> students와 people만 상속 가능함

public class ResponseMain {

    public static CMRespDto<?> response(String msg, Object data) { // <?> = 어떤 자료형을 넣을지 모름. return 자료형에 많이 씀
        return new CMRespDto<>(msg, data); // <>비워도 ()자료형을 찾아줌
    }

    public static void main(String[] args) {

        Student student = Student.builder()
                .studentCode(20220001)
                .name("임지현")
                .build();

        System.out.println(response("학생 데이터 응답", student));
        System.out.println(response("student code error!!", "학번에 오류가 있습니다."));

    }

}
