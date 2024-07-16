import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
	
	
	private double length;
	private double breath;
	
	
	 Area(double length, double breath) {
		this.length = length;
		this.breath = breath;
	}
	
	
	public double returnArea() {
		return length * breath;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner scanner = new Scanner(System.in)) {
		
		System.out.println("Enter the length: ");
		double length = scanner.nextDouble();
		
		
		System.out.println("Enter the Breath: ");
		double breath = scanner.nextDouble();
		
		Area area1 = new Area(length, breath);
		
		double result = area1.returnArea();
		System.out.println(result);
		
		}catch (InputMismatchException e) {
		System.out.println(e.getMessage());	
			
		}
		

	}

}
