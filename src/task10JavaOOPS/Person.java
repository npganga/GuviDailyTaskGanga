package task10JavaOOPS;

class Person {

	private String name;
	private int age;
	
	//Constructor
	public void person(String username, int userage) {
		name = username;
		age = userage;
	}
	
	//get the name
	public String getName(String username) {
		return name;
	}

	//get the age
	public int getAge(int userage) {
		return age;
	}
}