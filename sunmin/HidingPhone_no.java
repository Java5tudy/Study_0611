package Programmers;
import java.util.Scanner;
public class HidingPhone_no {
	
	
    public static String solution(String phone_number) {	
    	 char[] phno = phone_number.toCharArray();
         for(int i = 0; i < phno.length - 4; i ++){
             phno[i] = '*';             
         }
         System.out.println(phno);
         String answer =String.valueOf(phno);
         return answer;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	System.out.println("�ڵ��� ��ȣ�� �Է��ϼ���:");
    	String p = sc.next();
    	solution(p);
	}
}


//���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
//��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, 
//��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� *���� ���� ���ڿ��� �����ϴ� �Լ�, 
//solution�� �ϼ����ּ���.
//s�� ���� 4 �̻�, 20������ ���ڿ��Դϴ�.