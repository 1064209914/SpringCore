package entity;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class User {
	private int id;
	private String userName;
	private String password;
	private String email;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}
	
	
}
