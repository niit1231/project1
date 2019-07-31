package pack1;

public class User {
	private String name, email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "Name:" + name + "\nEmail:" + email;
	}

	@Override
	public boolean equals(Object obj) {
		User user= (User) obj;
		return (name.equalsIgnoreCase(user.name)&& email.equals(user.email));
	}
	
	

}
