package in.co.rays.Hello;

public class Namecount1 {
	public static void main(String[] args) {
		
		String[] name = {"pranav","chirag","anupam"};
	
		int count=0;	
	
	     for (int i=0; i<name.length; i++) {
	for (int j=0; j<name[i].length(); j++) {
		
		if (name[i].charAt(j)=='a') {
			count++;
			
			
		}
		
	}
	System.out.println(count);
	
	     }
	
	
	
	
	
	
	}
}
