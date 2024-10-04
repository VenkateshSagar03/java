package in.nit.workshop;

public class ArrayOperation {

	public static void main(String[] args) {
		// get the sum of array elements
		int number[] = {2,6,3,8,9};
		int sum =0;
		for(int index =0; index< number.length;index++) {
			sum = sum + number [index];
		}
			System.out.println("sum is"+sum);
			
		// even and odd //if condition
		    for (int index = 0;index< number.length;index++) {
		         if(number[index] %2==0) {
		        	 System.out.println("if is even number:"+ number);
		         }else {
		        	 System.out.println("it is odd number:"+number);
		        	 
		         }
		   
		
		}
		 
	    
    

	}} 

