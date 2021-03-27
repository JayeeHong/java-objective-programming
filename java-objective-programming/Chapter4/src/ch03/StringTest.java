package ch03;

public class StringTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		System.out.println(System.identityHashCode(java));
		java = java.concat(android);
		
		System.out.println(System.identityHashCode(java)); 
		//java
		//android
		//javaandroid
		//3개가 다른 주소값임 -> 메모리가 계속 생성됨 -> StringBuilder, StringBuffer 사용
	}
}
