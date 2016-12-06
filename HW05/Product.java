public class Product
{
	private String name;
	private double price;
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public void displayProduct() {
		System.out.println(this.name + ": " + this.price +" ROL");
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPriceInRON() {
		return price/10000;
	}
	public void setPriceInRON(double price) {
		this.price=price*10000;
	}
}
