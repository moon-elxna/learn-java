package übung06;

public class TennisSpielerin {
	
	private String name;
	private int age;
	private int startNum;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}
	
	public TennisSpielerin() {		
	}
	
	public TennisSpielerin(String name, int age) {	
		this.setName(name);
		this.setAge(age);	
	}
	
	public TennisSpielerin(String name, int age, int startNum) {	
		this.setName(name);
		this.setAge(age);
		this.startNum = startNum;
	}
}
