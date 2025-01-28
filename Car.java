public class Car {
	//pojo class
	private int price;
	private String brand;
	private int mileage;
    private String model;
	public Car(int price, String brand, int mileage, String model) {
		super();
		this.price = price;
		this.brand = brand;
		this.mileage = mileage;
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Car [price=" + price + ", brand=" + brand + ", mileage=" + mileage + ", model=" + model + "]";
	}	
    
    
    
}    