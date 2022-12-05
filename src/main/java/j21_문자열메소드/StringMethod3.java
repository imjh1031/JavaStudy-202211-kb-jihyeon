package j21_문자열메소드;

import java.util.function.Function;

public class StringMethod3 {

	public static void main(String[] args) {
		
		Function<String, String> replacePhoneToken = phoneNumber ->
		phoneNumber.replaceAll(" ", "").replaceAll("/", "").replaceAll("-", "").replaceAll("[.]", "");
		
		String phone = "010-9988-1916";
		
		System.out.println(replacePhoneToken.apply(phone));
		
		// 문자열을 찾아 -를 공백으로 바꿈
		System.out.println(phone.replaceAll("-", ""));
		phone = phone.replaceAll("-", "");
		phone = phone.replaceAll("/", "");
		System.out.println(phone);
		
	}
	
}
