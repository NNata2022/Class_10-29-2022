package home_assigment_10_09;

public class Practice {

	public static void main(String[] args) {
		int i = 1;//1
		int j = i++  +  ++i;
		    //i=2           3 (=4)
		//j  1         1+2=4
		int k = ++j  +  j++;
		// 5            6   10()
		//   
		int l = k++ + ++k  +  k++ + i++;
		//i=4
				//k=11    12     13
				//l= 10    1+21+12 +3 = 37			
		//      11    12       13       ()37????       
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		
		// 

	}

}
