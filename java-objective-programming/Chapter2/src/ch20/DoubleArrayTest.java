package ch20;

public class DoubleArrayTest {

	public static void main(String[] args) {
		
		double[] dArr = new double[5];
		int count = 0;
		
		dArr[0] = 0.1; count++;
		dArr[1] = 0.2; count++;
		dArr[2] = 0.3; count++;
		
		double mtotal = 1;
		for(int i=0; i<count; i++) {
			mtotal *= dArr[i];
		}
		
		System.out.println(mtotal);
	}
}
