package HCM1069;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		//重写Sort comparator排序
		Comparator<Sort> comparator = new Comparator<Sort>(){
			public int compare(Sort s1,Sort s2){
				if(s1.a != s2.a){
					return s1.a - s2.a;
				}else if(s1.b != s2.b){
					return s1.a - s2.a;
				}else
					return s1.c - s2.c;
		
			}	
		};
		int n,i,j;
		Scanner scan = new Scanner(System.in);
		Boolean aaaaa  = true;
		int casenumber = 0;
		while(aaaaa){
			casenumber ++;
			n = scan.nextInt();
			if(n==0)
				break;
			int m = 3*n+1;
			//为了排序用了list;
			List<Sort> sort = new ArrayList<Sort>();
			for(i = 0;i<3*n;i+=3){
				int a = scan.nextInt();
				int b = scan.nextInt();
				int c = scan.nextInt();
				
				Sort sort1 = new Sort(a,b,c);
				Sort sort2 = new Sort(b,c,a);
				Sort sort3 = new Sort(c,a,b);
				sort.add(sort1);
				sort.add(sort2);
				sort.add(sort3);
			}
			
			Collections.sort(sort,comparator);
			int[] dp = new int[3*n+1];
			for(i=0;i<3*n+1;i++)
				dp[i] = 0;
			int res = 0;
			for(i=0;i<m;i++){
				dp[i] = sort.get(i).c;
				for(j=0;j<i;j++){
					if(sort.get(j).b<sort.get(i).b&&sort.get(j).a<sort.get(i).a){
						dp[i] = max(dp[i],dp[j]+sort.get(i).c);
					}
				}//for
				res = max(res,dp[i]);
			}//for
			
			System.out.println("Case "+casenumber+": maximum height = "+res);
		
		}
	}

	private static int min(int a, int b) {
		return (a>b?b:a);
	}

	private static int max(int a, int b) {
		return (a>b?a:b);
	}
}

class Sort{
	int a;
	int b;
	int c;
	Sort(int a,int b,int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
}
