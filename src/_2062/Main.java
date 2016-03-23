package _2062;

import java.util.ArrayList;
import java.util.List;




public class Main {

	static long order(int n){
		if(n == 1){
			return 1;
		}
		return n*(order(n-1)+1);
	}
	
	
	public static void main(String[] args){
		StringBuffer bf = new StringBuffer();
		int n = 4;
		int mth = 15;
		long nOrderNumber = order(n);
		long lineNumber = nOrderNumber/n;
		long mthLine = mth/lineNumber;
		bf.append(mthLine);
		long mthLocation = mth%lineNumber;
		while(mthLocation != 0){
			
			
		}
		
		
	}
}
