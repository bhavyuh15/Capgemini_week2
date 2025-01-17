 import java.util.Scanner;
 public class main{
	 public void totalprice(int Price){
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Quantity ");
		 int quantity=sc.nextInt();
		 System.out.println("total price = " + Price *quantity);
	 }
	 public static void main(String args []){
		 Scanner sc = new Scanner(System.in);
		 item obj = new item();
		 obj.display(2,"pen",15);
		 main obj1 = new main();
		 obj1.totalprice(obj.price);
		 
	 }
 }
 class item{
	
	   public     int itemcode ;
	public String itemName;
	public int price;
	 public void display(int itemcode,String itemName,int price){
this.itemcode=itemcode;
this.itemName=itemName;
this.price=price;
System.out.println("item code = "+itemcode);
 	System.out.println("item name = " + itemName);
	System.out.println("item price = " + price);
	 }
 }
 