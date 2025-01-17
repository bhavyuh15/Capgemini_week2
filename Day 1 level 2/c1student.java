public class main {
	public static void main(String args[]){
		book obj = new book();
		obj.display("vivek",9,44);
		obj.calculate(obj.marks);
	}
}
	
class book{
	public 
	   String name ;
		int rollno ;
		int marks;
		public  void display(String name,int rollno, int marks){
			this.name=name;
			this.rollno=rollno;
			this.marks=marks;
			System.out.println("name = " + name);
			System.out.println("rollno = " + rollno);
			System.out.println("marks = " + marks);
		}
		public void calculate(int marks){
			if(marks<=50){
			System.out.println("your grade is 	D");
			}
			else if(marks>=50 && marks<=70){
			System.out.println("your grade is 	C");
			}
			if(marks>=71 && marks<=90){
			System.out.println("your grade is 	B");
			}
			if(marks>=91 && marks<=100){
			System.out.println("your grade is 	A");
			}
}
}