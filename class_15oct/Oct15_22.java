package class_15oct;

public class Oct15_22 {

	public static void main(String[] args) {
		//int a = 1;
		//int b = 2;
		
		//if(a>b)
		//System.out.println("correct");
		
		//else 
			//System.out.println("incorrect");
		
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		
		if (a>b && a>c && a>d)
			System.out.println("a is a greatest: " +a);
		else if (b>a && b>c && b>d)
			System.out.println("b is a greatest: " +b);
		else if (c>a && c>b && c>d)
			System.out.println("c is a greatest: " +c);
		else  
			System.out.println("d is a gteatest : " +d);
		if (a<b && a<c && a<d)
			System.out.println("a is a smallest: " +a);
		else if (b<a && b<c && b<d)
			System.out.println("b is a smallest: " +b);
		else if (c<a && c<b && c<d)
			System.out.println("c is a smallest: " +c);
		else 
			System.out.println("d is a smallest : " +d);
		
		

	}

}
