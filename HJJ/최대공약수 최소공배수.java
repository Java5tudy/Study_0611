import java.util.Arrays;

public class tt {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int bigger = 0;
        
        if(n < m) { // 둘 중에서 더 큰 수 찾기
        	bigger = m;
        }else {
        	bigger = n;
        }
        //큰 값에서 1씩 줄여보면서 두 값을 가지고 나눴을 때 0으로 나눠 떨어지면 최대공약수
        int i = bigger;
        while(1 < bigger) {
        	if(n % i == 0 && m % i ==0) {
        		answer[0] = i; // 최대공약수 
        		answer[1] = n * m / i; // 두 수를 곱한 뒤 최대공약수로 나누면 최소공배수
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