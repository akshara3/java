package project;

public class Ex1 {

	int a = 500;

	public void m1() {
		System.out.println("this is ex1 class method");
	}
}

class Ex2 extends Ex1 {
	int a = 600;

	public void m1() {
		System.out.println(super.a);
		super.m1();
		System.out.println("this is ex2 class method");
	}

}

class mainclass {
	public static void main(String[] args)

	{
		Ex2 e1 = new Ex2();
		e1.m1();

	}
}
