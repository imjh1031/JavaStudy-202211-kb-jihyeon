package doit_컬렉션.Set_인터페이스.HashSet;

public class Member {
	private int memberId;
	private String memberName;
	
	@Override
	public int hashCode() {
		return memberId; // hashCode() 메서드가 회원 아이디를 반환하도록 재정의
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId) // 매개변수로 받은 회원 아이디가
				return true;					 // 자신의 회원 아이디와 같다면 true 반환
			else
				return false;
		}
		return false;
	}
	
}
