import java.util.Scanner;


public class Solution_1959 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("helloworld");
		int T = 0; //테스트케이스의 수 초기화
		int N,M = 0; // A배열의 크기와 B배열의 크기를 나타내수는 변수 초기화
		
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		for(int i=0;i<T;i++) {
			N = sc.nextInt();
			M = sc.nextInt();
			System.out.printf("%d번째 케이스의, N은 %d, M은 %d", i+1,N,M);
			
		    int[] A = new int[N]; //N만큼을 배열의 크기로 갖는 배열 A선언
	        int[] B = new int[M]; //M만큼을 배열의 크기로 갖는 배열 B선언
	        
	        if(N>M) { //A배열의 길이가 B배열의 길이보다 클때
	        	int sum = 0;
	        	for(int j=0; j<M; j++) {
	        		sum = sum + A[j] * B[j];
	        		System.out.println(sum);
	        	}
	        }
		}
		
    
        
        
	}

}
