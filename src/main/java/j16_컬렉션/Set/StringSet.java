package j16_컬렉션.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSet {

	public static void main(String[] args) {

		Set<String> nameSet = new HashSet<String>();
		
		nameSet.add("김준일");
		nameSet.add("김수현");
		nameSet.add("문경원");
		nameSet.add("권용범");
		nameSet.add("이영인");
		
		System.out.println(nameSet);
		
		for(String s : nameSet) { // 하나만 꺼내오고 싶을땐 for문이 아닌 foreach
			if(s.equals("김준일")) {
				System.out.println(s);
				break;
			}
			
		}
		
		List<String> nameList = Arrays.asList(new String[] {"김준일", "권용범"});
		
		System.out.println(nameList);
		
		Set<String> listToSet = new HashSet<String>();
		listToSet.addAll(nameList); // addAll = list를 set으로 모두 옮겨줌
		
		System.out.println(listToSet);
		
		nameSet.remove("김준일"); // .remove = 값을 지움
		
		System.out.println(nameSet); // set 업데이트 = 삭제와 추가
	}

}
