import java.util.Arrays;

public class tt {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int bigger = 0;
        
        if(n < m) { // �� �߿��� �� ū �� ã��
        	bigger = m;
        }else {
        	bigger = n;
        }
        //ū ������ 1�� �ٿ����鼭 �� ���� ������ ������ �� 0���� ���� �������� �ִ�����
        int i = bigger;
        while(1 < bigger) {
        	if(n % i == 0 && m % i ==0) {
        		answer[0] = i; // �ִ����� 
        		answer[1] = n * m / i; // �� ���� ���� �� �ִ������� ������ �ּҰ����
        		break;
        	}
        	i = i - 1;
        }
        return answer;
    }

	public static void main(String[] args) {
		tt ml = new tt();
		ml.solution(4, 6);
		System.out.println(Arrays.toString(ml.solution(4, 6)));
		}
	}