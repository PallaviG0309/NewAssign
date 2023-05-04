package assignment;

public class SumNumber {

	public static void main(String[] args) {
	 
		int a= 234;
		int sum;
		for(sum=0; a!=0; a=a/10)  
		{  
		//finds the last digit and add it to the variable sum      
		sum = sum + a % 10;  
		}  
		//prints the result  
		System.out.println("Sum of digits: "+sum);  

	}

}
