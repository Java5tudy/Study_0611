package Programmers;
import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.println("�Է��� ���� ������ ��������.");
		a = sc.nextInt();
		System.out.println("���̰� ���� ���簢���� ������?");
		b = sc.nextInt();
		        
			for(int i=1; i<=b; i++) {
				for(int j=1; j<=a; j++)
						System.out.print("*");
		            System.out.println();
		    }

	}
}