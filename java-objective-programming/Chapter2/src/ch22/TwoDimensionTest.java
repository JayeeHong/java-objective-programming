package ch22;

public class TwoDimensionTest {
	
	public static void main(String[] args) {
		
//		int[][] arr = {{1,2,3,}, {1,2,3,4}};
		int[][] arr = new int[3][4]; //0으로 초기화됨
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + ",");
			}
			System.out.println("\t length:" + arr[i].length);
		}
	}

}
