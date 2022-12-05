package j21_문자열메소드;

public class StringMethod2 {

	public static void main(String[] args) {
		
		String roles = "ROLE_USER, ROLE_MANAGER, ROLE_ADMIN";
		
		String[] roleArray = new String[3];
		
		String tempRoles = roles;
		// , 전까지 자름. 
		roleArray[0] = tempRoles.substring(0, tempRoles.indexOf(", ") != -1 ? tempRoles.indexOf(", ") : tempRoles.length());
		tempRoles = tempRoles.substring(tempRoles.indexOf(", ") + 2);
		// , 전까지 자름. ROLE_USER 앞을 자름.
		roleArray[1] = tempRoles.substring(0, tempRoles.indexOf(", ") != -1 ? tempRoles.indexOf(", ") : tempRoles.length());
		tempRoles = tempRoles.substring(tempRoles.indexOf(", ") + 2);
		// -1 = 해당 문자열을 못찾았을 때. length로 가져옴.
		roleArray[2] = tempRoles.substring(0, tempRoles.indexOf(", ") != -1 ? tempRoles.indexOf(", ") : tempRoles.length());
		
		for(String role : roleArray) {
			System.out.println(role);
		}
		System.out.println();
		
		// ", "를 다 잘라서 배열로 만듬
		String[] roleArray2 = roles.split(", ");
		for(String role : roleArray2) {
			System.out.println(role);
		}
		
	}
	
}
