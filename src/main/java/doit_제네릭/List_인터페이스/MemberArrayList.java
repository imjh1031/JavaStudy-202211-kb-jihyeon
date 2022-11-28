package doit_제네릭.List_인터페이스;

import java.util.ArrayList;

public class MemberArrayList {

    private ArrayList<Member> arrayList; // ArrayList 선언

    public MemberArrayList() {
        arrayList = new ArrayList<Member>(); // Member형으로 선언한 ArrayList 생성
    }

    public void addMember(Member member) { // ArrayList에 회원을 추가하는 메소드(맨 뒤에)
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) {
        for(int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i); // get() 메소드로 회원을 순차적으로 가져옴
            int tempId = member.getMemberId();
            if(tempId == memberId) {          // 회원 아이디가 매개변수와 일치하면
                arrayList.remove(i);          // 해당 회원을 삭제
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다.");
        return false; // 반복문이 끝날 때까지 해당 아이디를 찾지 못한 경우

    } // 해당 아이디를 가진 회원을 ArrayList에서 찾아 제거함

    public void showAllMember() {
        for(Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println();

    } // 전체 회원을 출력하는 메소드

}
