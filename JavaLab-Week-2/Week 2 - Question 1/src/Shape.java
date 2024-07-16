abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Rectangle extends Shape {
    double length;
    double breath;
    
    Rectangle(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }
    
    @Override
    public double calculateArea() {
        return length * breath;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * (length + breath);
    }
    
    

 
}

class Cirlce extends Shape {
    double radius;
 
    
    Cirlce(double radius) {
        this.radius= radius;
        
    }
    
    @Override
    public double calculateArea() {
    	return Math.PI * (radius * radius) ;
    }
    
    @Override
    public double calculatePerimeter() {
    	return 2 * radius * Math.PI;
    }
    
    

 
}




