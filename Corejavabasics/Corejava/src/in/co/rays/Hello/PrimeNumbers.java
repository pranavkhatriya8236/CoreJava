package in.co.rays.Hello;

public class PrimeNumbers {
public static void main(String[] args) {
	
	int number =15;
	int count =0;
	
	for (int i=2; i< number; i++) {
	

	if (number % i == 0) {
    count++;
	}
	
	if (count==0)   {
	System.out.println("it is  a prime number");
	
	
	}else {
	
	System.out.println("it is not prime number");
	
	}
}
}
}