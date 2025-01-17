public class main {
	public static void main(String args[]){
		Mobilephone obj = new Mobilephone();
		obj.display("apple","iphone",70500);
	}
}
	
class Mobilephone{
	public 
	   String brand ;
		String model ;
		int price;
		public  void display(String brand,String model, int price){
			this.brand=brand;
			this.model=model;
			this.price=price;
			System.out.println("brand = " + brand);
			System.out.println("model = " + model);
			System.out.println("price = " + price+"rs");
		}
}