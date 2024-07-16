

public class Division {
	


	
	public static double divide(int num1, int num2) {
		if(num2 == 0) {
			throw new ArithmeticException("Division by Zero is not acceptable");
		}
		return num1/num2;
	}
	
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		
		
		try {
			
			double result = divide(num1,num2);
			System.out.println(result);
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		
	}

}



