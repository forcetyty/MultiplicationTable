package Multiplication;

public class MultiTable {
	
	//20201122 
	//Part.1
	
	// 요구사항
	// 2단 부터 9단까지 출력하는 구구단
	// 가로로 출력
	// 세로로 출력
	
	public static void main(String[] args) {
		
		// 세로로 출력
		for(int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			
			for(int j=1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			
			System.out.println();
		}
		
		
		
		// 세로로 출력
		for(int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for(int j=1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + i*j + "\t");
			}
			
			System.out.println("\r");
		}
		
		
	
	}
	

}
