public class main {
	public static void main(String args[]){
		book obj = new book();
		obj.display("IT ENDS WITH US","COLLEN HOOVER",115);
	}
}
	
class book{
	public 
	   String title ;
		String author ;
		int price;
		public  void display(String title,String author, int price){
			this.title=title;
			this.author=author;
			this.price=price;
			System.out.println("title = " + title);
			System.out.println("author = " + author);
			System.out.println("price = " + price+"rs");
		}
}