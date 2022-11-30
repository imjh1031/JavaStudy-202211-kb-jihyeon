package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMethod {
	
	public static void printList(String listName, List<String> list) {
		System.out.println("[ " + listName + " ]");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " ->\t");
			System.out.println(list.get(i));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		List<String> nameList = new ArrayList<String>();
		List<String> nameList2 = new ArrayList<String>();
		
		// add() -> 리스트에 값을 추가함
		nameList.add("임지현");
		nameList.add("신경수");
		nameList.add("고희주");
		nameList.add("문승주");
		nameList.add("장건녕");
		nameList.add("박수현");
		printList("nameList", nameList);
		
		// addAll() -> 리스트에 다른 Collection의 값을 모두 추가함
		nameList2.addAll(nameList);
		printList("nameList2", nameList2);
		nameList2.addAll(3, nameList); // 3번부터 붙여넣기. 끝나는 번호로 다시 시작
		printList("nameList2", nameList2);
		
		// contains() -> 리스트에 해당 값이 있는지 확인(boolean 타입 반환)
		boolean isContains = nameList.contains("장건녕");
		System.out.println("이름 목록에 장건녕이 있나? " + (isContains ? "있다" : "없다"));
		System.out.println();
		
		// indexOf() -> 리스트에서 해당 값의 인덱스 위치를 반환
		int index = nameList.indexOf("고희주");
		System.out.println("리스트에서 고희주의 인덱스 위치 : " + index);
		
		// lastIndexOf() -> 리스트에서 해당 값의 인덱스 위치를 반환(뒤에서부터 탐색)
		int lastIndex = nameList2.lastIndexOf("임지현");
		System.out.println("리스트에서 임지현의 인덱스 위치 : " + lastIndex);
		
		boolean isEmpty = nameList.isEmpty();
		System.out.println("해당 리스트가 비어있는가? " + isEmpty);
		
		for(String name : nameList) {
			System.out.println(name);
		}
		System.out.println();
		
		Iterator<String> ir = nameList.iterator();
		
		while(ir.hasNext()) { // has : 있다 or 없다, is : 이다 or 아니다
			System.out.println(ir.next()); // next : 다음 값을 꺼내라. 다 꺼내면 hasNext()는 false가 되면서 종료됨
		}
		System.out.println();
		
		nameList.forEach(name -> {
			System.out.println(name);
		});
		
	}

}
