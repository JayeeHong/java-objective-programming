package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("java.lang.String");
		
		//String class 持失切
		Constructor[] cons = c.getConstructors();
		for(Constructor con : cons) {
			System.out.println(con);
		}
		
		//String class 五社球
		Method[] m = c.getMethods();
		for(Method method : m) {
			System.out.println(method);
		}
	}
}
