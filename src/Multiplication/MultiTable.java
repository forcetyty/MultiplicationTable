package Multiplication;

public class MultiTable {
	
	//20201122 
	//Part.1
	
	// �䱸����
	// 2�� ���� 9�ܱ��� ����ϴ� ������
	// ���η� ���
	// ���η� ���
	
	public static void main(String[] args) {
		
		// ���η� ���
		for(int i = 2; i <= 9; i++) {
			System.out.println(i + "��");
			
			for(int j=1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			
			System.out.println();
		}
		
		
		
		// ���η� ���
		for(int i = 2; i <= 9; i++) {
			System.out.println(i + "��");
			for(int j=1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + i*j + "\t");
			}
			
			System.out.println("\r");
		}
		
		
	
	}
	

}
