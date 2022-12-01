package j17_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson2 {

	public static void main(String[] args) {
		
		User user = User.builder()
				.username("jihyeon")
				.passward("1234")
				.name("임지현")
//				.email("jihyeon@dhgdfjdg.com")
				.build();
		
		System.out.println(user);
		
//		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				.serializeNulls()
				.excludeFieldsWithoutExposeAnnotation()
				.create();
		
		String userJson = gson.toJson(user);
		
		System.out.println(userJson);
		
		User userObj = null;
		
		userObj = gson.fromJson(userJson, User.class);
		System.out.println(userObj);
	}
	
}
