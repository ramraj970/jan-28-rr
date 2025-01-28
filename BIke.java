
public class BIke {
	private String name;
	private String model;
	private int price;
	private int milage;
	public BIke(String name, String model, int price, int milage) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
		this.milage = milage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	@Override
	public String toString() {
		return "BIke [name=" + name + ", model=" + model + ", price=" + price + ", milage=" + milage + "]";
	}
	

}
