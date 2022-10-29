package home_assigment_10_09;

public class Incremental_Decremental_HW {

	public static void main(String[] args) {
		int t =1; //-3
		int y = ++i - --i;
		//      2   - 1 =1
		
		int u = j-- - --i + i-- - --j;
		// k=   1                  
		// j=   0                 -1
		// i=        0       -1
		                 
			        
		int l = --k - k-- + i-- - --i + j++ - --j;
		
	// i++ - returns the original value of i and then increase it by 1
	// ++i -  increase i by 1 then returns the new value
		
	System.out.println(t);
	System.out.println(y);
	System.out.println(u);
	System.out.println(l);
	
	int a = 100;//100, 98 -100, 99
	int b = --a;//99 ,100 -99, 100
	int c = ++b;//100, 99 -100, 99
	int d = c--;//100     -100
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	
	int i =1;//1, 
	int j = ++i - --i;//2 - 
	int k = j-- - --i + i-- - --j;
	
	System.out.println(i);
	System.out.println(j);
	System.out.println(k);
	
	
	

	}

}
