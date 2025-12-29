package compiletimepolymorphism;

public class CompiletimePolymorphism {
	public void compiletimePolymorphism(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void compiletimePolymorphism(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println(sum);
	}
	public void compiletimePolymorphism(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompiletimePolymorphism c=new CompiletimePolymorphism();
		c.compiletimePolymorphism(1, 2);
		c.compiletimePolymorphism(2, 2, 2);
		c.compiletimePolymorphism("mithya");

	}

}
