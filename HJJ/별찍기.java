import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = 0; i < b; i++) { //세로 별찍기
           for(int j = 0; j < a; j++) { // 가로별찍기
                System.out.print("*");
           }
            System.out.println();
        }
    }
}