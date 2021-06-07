class A {
	public A() {
		System.out.print("Inside A's constructor");
	}
	public void printstr() {
		System.out.println("Class A's Str");
	}
	
}
public class B extends A {
	public B() {
		System.out.print("Inside B's constructor");
	}
	public void printstr() {
		System.out.println("Class B's Str");
	}
	public static void main(String[] args) {
		B obj = new B();
		obj.printstr();
	}
	
}