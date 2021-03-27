package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		Student std3 = std1;
		
		System.out.println(std1 == std2);
		
		//equals() 재정의
		System.out.println(std1.equals(std2)); 
		
		System.out.println(std1 == std3);
		
		//hashCode() 재정의
		System.out.println(std1.hashCode()); 
		System.out.println(std2.hashCode());
		
		//hash code 출력
		System.out.println(System.identityHashCode(std1)); 
		System.out.println(System.identityHashCode(std2));
		
		//clone() : 인스턴스를 그대로 복제함
		std1.setStudentName("Kim");
		Student copyStudent = (Student)std1.clone(); 
		System.out.println(copyStudent);
		
		System.out.println("============");
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Integer i = 100;
		System.out.println(i.hashCode());
		
	}
}
