import java.util.Scanner;



public class Main {

	public static void main(String args[]){
		int n;
		int a;
		int b;
		Scanner scan = new Scanner(System.in);
		
	
		while(scan.hasNext()){
			a = scan.nextInt();
			b = scan.nextInt();
			n = scan.nextInt();
			if(n == 0 && b == 0&& a== 0)
				System.exit(0);
			else if(n < 1 || n > 100000000 || a < 1 || a > 1000||b<1 ||b>1000)
				System.exit(0);
			a = a % 7;
			b = b % 7;
			int f[] = new int[50];
			for(int i = 1; i <= n%7;i++){
				if(i==1 || i ==2)
					f[i] = 1;
				else
				f[i] = (a*f[i-1]+b*f[i-2])%7;
			}
			System.out.println(f[n%7]);
			
		}
	}
}
	
/*	public static int  f(int  n ,int A ,int B){
		if(n <= 2)
			return 1;
		else
			return (A*f(n-1,A,B)+B*f(n-2,A,B))%7;
	}
}
*/