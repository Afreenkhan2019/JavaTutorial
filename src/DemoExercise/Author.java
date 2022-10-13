package DemoExercise;

public class Author {

	public String name;
	public String email;
	public String  gender;
	
	public Author(String aName, String aEmail, String aGender) {
		
		this.name=aName;
		this.email=aEmail;
		this.gender=aGender;
		
	}
	public String getName() {
		return this.name;
		
	}
	public String getEmail() {
		return this.email;
	}
	
	public String getGender() {
		return this.gender;
	}
	public void setName(String aName) {
		this.name= aName;
	}
	public void setEmail(String aEmail) {
		this.email=aEmail;	
	}
	public void setGender(String aGender) {
		this.gender=aGender;
	}	
}
	

