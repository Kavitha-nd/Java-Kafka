package class_object;
//***static, which means you can call these methods directly using the class name without creating an instance of the class.

//public class Test {
//int a=10;
//	
//	void dispaly() {
//		int a=20;  
//		System.out.println( this.a);// THIS KeyWord
//	}
//	
//	public static void main(String[] args) {
//		Test s1 = new Test();
//		s1.dispaly();
//
//	}
//}




//class Parent{
//	
//	int a=20;
//	void display() {
//		System.out.println("Parent");
//		
//	}
//}
//class Child extends Parent{
//	int a= 40;
//	void display() {
//			System.out.println("Child");
//			System.out.println(a);
//			System.out.println(super.a);
//			super.display();
//	}
//}
//
//class Test{
//	public static void main(String[] args) {
//		Child obj = new Child();
//		obj.display();
//	}	
//}






class Car{
	public String model="new_model";
	
	 void display() {
		System.out.println("hi "+ model);
	 }
	
}
public class Test{
	
	private String name = "Swift";
	
	public static void main(String[] args) {
		Test obj = new Test();
		System.out.println(obj.name );
		
		Car c1 = new Car();
		System.out.println(c1.model);
		
		c1.display();		
	}

	private void display() {
		// TODO Auto-generated method stub
		
	}
}


