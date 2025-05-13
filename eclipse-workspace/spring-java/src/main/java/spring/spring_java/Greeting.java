package spring.spring_java;

public class Greeting {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Greeting() {
		
		
		System.out.println("greeting initialized...");
	}
	
	public void initGreet() {
		System.out.println("inter");
	}
	public void destroyGreet() {
		System.out.println("destroyed");
	}
	
	
}