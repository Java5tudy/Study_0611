
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        
	        int[] arr = new int[100]; 
	        //int [] arr = {1,2,3,4};
	        double answer = 0;
	        int sum = 0;
	        for(int i = 0; i < arr.length; i++){ 
	            sum += arr[i];
	        }
	        
	        answer = (double)sum / arr.length;
	        System.out.println(answer);
	    }
		

}
	

