public class main {
	public static void main(String args[]){
		employee obj = new employee();
		obj.display("Bhavya",1,999999999);
	}
}
	
class employee{
	public 
	   String name ;
		int id ;
		int salary;
		public  void display(String name,int id , int salary){
			this.name=name;
			this.id = id;
			this.salary=salary;
			System.out.println("Name " + name);
			System.out.println("id " + id);
			System.out.println("Salary " + salary);
		}
}