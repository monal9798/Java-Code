class Program24{
	 protected String brand = "Ford";      
  	 public void honk() {                    
    	System.out.println("Tuut, tuut!");
  	}
}

class Car extends Program24 {
  private String modelName = "Mustang";    // Car attribute
  public static void main(String[] args) {

    // Create a myCar object
    Car myCar = new Car();

    // Call the honk() method (from the Program24 class) on the myCar object
    myCar.honk();

    // Display the value of the brand attribute (from the Program24 class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}