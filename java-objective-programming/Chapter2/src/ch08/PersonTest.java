package ch08;

public class PersonTest {
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.height = 180;
		person1.weight = 78;
		person1.gender = "남성";
		person1.name = "Thomas";
		person1.age = 37;
		
		System.out.println(person1.showPersonInfo());
		
		Person person2 = new Person(175, 70, "여성","Tracy", 37);
		
		System.out.println(person2.showPersonInfo());
	}
	
}
