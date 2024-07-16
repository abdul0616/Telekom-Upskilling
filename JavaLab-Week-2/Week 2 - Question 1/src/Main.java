


public class Main {

	   public static void main(String[] args) {
	        Rectangle myRectangle = new Rectangle(2.0, 3.0);
	        double areaResult = myRectangle.calculateArea();
	        double perimeterResult = myRectangle.calculatePerimeter();
	        
	        System.out.println("Rectangle Area: " + areaResult);
	        System.out.println("Rectangle Perimeter: " + perimeterResult);
	        
	        Cirlce myCircle = new Cirlce(2.0);
	        double areaResultCircle = myCircle.calculateArea();
	        double perimeterResultCircle = myCircle.calculatePerimeter();
	        
	        
	        System.out.println("Circle Area: " + areaResultCircle);
	        System.out.println("Circle Perimeter: " + perimeterResultCircle);
	 
	    }


	
	
}
