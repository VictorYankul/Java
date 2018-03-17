package Ex18_1_Serialization;

import java.io.Serializable;

public class Profile implements Serializable {
	private String surname;
	private String name;
	private String mobile;
	

	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
