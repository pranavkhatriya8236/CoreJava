package in.co.rays.Hello;

public class Palindrom3 {

	public static void main(String[] args) {
		
		int a =121;
		int b = a;
		int c =0;
		int d;
		
	while (b>0)  {
		
		d = b%10;
		c = c*10+d;
		b = b/10;
		
	}
	if (a==c) {
		
		System.out.println("it is a palindron");
		
	}else {
		System.out.println("it i nit a palindrom");
	
	
	
	
	
	}
	}
	
}
