package home_assigment_10_09;

public class Increment_HW_pract {

	public static void main(String[] args) {
		int i =1; 
		// i= 1 
		int j = ++i - --i;
		//  j =   2 - 1=1
		//  i =   2   1 0  -1
		int k = j-- - --i + i-- - --j;
		//  k = 1   -  0   + 0   - -1=2
		//  j = 0  -1  
		int l = --k - k-- + i-- - --i + j++ - --j;
		//  l = 1   - 1   +  -1 - -3  +  -1 - -1=2
		// k= 1  0
		// i= -2  -3
		//j= 0 -1
		
		//i=-3, j=-1;k=0;l=2
		
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);

	}

}
