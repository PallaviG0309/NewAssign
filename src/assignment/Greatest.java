package assignment;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num1 = 10;
		  int num2 = 34;
		  int num3 = 12;
		   
		  if (num1 > num2)
		   if (num1 > num3)
		    System.out.println("The greatest:" + num1);
		   
		  if (num2 > num1)
		   if (num2 > num3)
		    System.out.println("The greatest: " + num2);
		   
		  if (num3 > num1)
		   if (num3 > num2)
		    System.out.println("The greatest: " + num3);
	}

}
