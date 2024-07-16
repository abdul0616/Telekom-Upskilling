
public class Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		Invoking the printNameDetails function
		printNameDetails("usman","Abdul Matin");

		
//		Invoking the checkAge function
		checkAge(14);
		
//		Invoking the looping
		Whilelooping();
		
		Forlooping();
		
		
//		Invoking Temperatue
		Temperature();
		
//		Nested loop
		Square(10);
		
		
//		Implementing the switch method
		switching(12);

	}
	
	
	static void switching(int age) {
		
		switch(age) {
		
		case 12:
			System.out.println("You are a child");
			break;
		case 19:
			System.out.println("You are a teenager");
			break;
		case 59:
			System.out.println("You are a child");
			break;
		default : 
			System.out.println("Print hello world");
//		default :
//			(if age >= 60) {
//				System.out.println("You are a child");
//			}else {
//				System.out.println("Invalid age");
//			}

			break;
	}
	}

	
	
//	QUESTION 3 sub 1
	static void checkAge(int age) {
		
		
		if(age >= 18) {
			System.out.println("You are an adult");
		} else {
			System.out.println("You are a minor");
		}
	}
	
	
//	QUESTION 3 sub 3
	
	static void Forlooping() {
		for(int num =0; num < 10; num++) {
			System.out.println(num);
		}
	}
	
//	QUESTION 3 sub 5
	static void Whilelooping() {
		int num = 10;
		while (num != 0) {
			System.out.println(num);
			num--;
		}
	}
	
	
	
//	Question 1
	
	static void Temperature() {
		
		
//		Declare an integer variable named `bankBalance`.
		int bankBalance;
		
//		Initialize `bankBalance` with a value of 500
		bankBalance = 500;
		
//		Add 250 to the `bankBalance`.
		bankBalance += 250;
		
//		Subtract 100 from the `bankBalance
		bankBalance -= 100;
		
		
//		Print the resulting value of `bankBalance`
//		System.out.println(bankBalance);
		
		
		
//		Declare a double variable named `fahrenheit`.
		double fahrenheit;
//		Assign `fahrenheit` an initial value between 0 and 100.
		fahrenheit =50;
		
//		Declare another double variable named `celsius`.
		double Celsius;
		
//		Calculate the value of `celsius` based on the value of `fahrenheit`.
		Celsius = (fahrenheit - 32) * 5 / 9;
		
		System.out.println(Celsius);
	}
	
	
//	Question 2
	
	static void printNameDetails(String firstname, String lastname) {
		
		String fullname = firstname +" "+ lastname;
		
		System.out.println("Hello, my name is " + fullname);
		System.out.println("There are " + firstname.length()+" letters in my first name and "+ lastname.length()+ " letters in my last name");
		
	}
	
	static void Square(int num ) {
//		 num = 8;
		 for(int i = 1; i <= num; i++) {
			 for(int j= 1; j <= num; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	}
	

}
