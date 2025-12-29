package runtimepolymorphism;

public class ChildClass extends ParentClass {
	public void addition(int a,int b) {
		super.addition(1, 2);
		int sub=a-b;
		System.out.println(sub);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass c=new ChildClass();
		c.addition(3, 2);
		//upcasting method
		ParentClass p=new ChildClass();
		p.addition(4, 5);

	}

}
