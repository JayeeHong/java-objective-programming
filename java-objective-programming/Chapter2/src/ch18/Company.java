package ch18;

/*
 * 싱글톤 패턴 : 유일한 객체를 제공할 때 사용한다.
 */
public class Company {

	private static Company instance = new Company(); //유일한 객체
	
	private Company() {
		
	}
	
	//유일한 객체에 외부에서 접근 가능하게 함
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
}
