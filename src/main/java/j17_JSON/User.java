package j17_JSON;

import com.google.gson.annotations.Expose;

import lombok.Builder;
import lombok.Data;

/*
 * serialize (Object -> Json)
 * deserialize (Json -> Object)
 */

@Builder
@Data
public class User {

	@Expose(serialize = true, deserialize = true)
	private String username;
	@Expose(serialize = false, deserialize = false)
	private String passward;
	@Expose(serialize = true, deserialize = false)
	private String name;
	@Expose(serialize = true, deserialize = true)
	private String email;
	
}
