package singleinheritance;

public class ChildClass extends ParentClass{
	public void childclassMethod() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass child=new ChildClass();
		child.childclassMethod();
		child.singleinharitance();

	}

}
