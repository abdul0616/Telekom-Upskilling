
abstract class vehicle {
	
	 public String make;
     public String model;
     public int year;
    
    
    
    vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public abstract void accelerate();

    public void vehicleDetails() {
        System.out.println("Vehicle: " + make + " " + model + " " + year);
    }



}

class Car extends vehicle {
	
   
	
	Car(String make, String model, int year) {
		super(make, model, year);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accelerate() {
		System.out.println("Car accelerates by pressing the accelerator pedal.");
	};
    

    
    

 
}


class Bike extends vehicle {
	
   
	
	Bike(String make, String model, int year) {
		super(make, model, year);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accelerate() {
		System.out.println("Car accelerates by pressing the accelerator pedal.");
	};
    

    
    

 
}
