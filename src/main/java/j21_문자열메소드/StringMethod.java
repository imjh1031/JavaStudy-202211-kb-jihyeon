package j21_문자열메소드;

public class StringMethod {

	public static void main(String[] args) {
		
		String name = "김준일김수현";
		
		System.out.println(name.length());
		
		// 문자의 위치 찾기
		System.out.println(name.indexOf("김"));
		System.out.println(name.indexOf("준"));
		System.out.println(name.indexOf("일"));
		
		// 문자의 위치 뒤에서 찾기
		System.out.println(name.lastIndexOf("김"));
		
		char name1 = name.charAt(0);
		System.out.println(name1);
		
		char name2 = name.charAt(name.indexOf("준"));
		System.out.println(name2);
		
		String subName1 = name.substring(0, 2); // 0 ~ 2번 인덱스까지 글자를 자름
		String subName2 = name.substring(2); // 2번 인덱스부터 끝까지
		System.out.println(subName1);
		System.out.println(subName2);
		
		System.out.println("김준일");
		System.out.println("김수현");
		
		String nameJunil = "김준일";
		
		System.out.println(name.substring(name.indexOf(nameJunil), name.indexOf(nameJunil) + nameJunil.length())); // 글자의 길이에 따라 자름
		
		String file = "C:/String.java";
		String fileName = null;
		String extension = null;
		
		fileName = file.substring("C:/".length(), file.lastIndexOf("."));
		System.out.println(fileName);
		extension = file.substring(file.lastIndexOf("."));
		System.out.println(extension);
	
				
	}
	
}
