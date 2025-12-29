package superkeywordexample;

public class ParentclassMethodchild extends ParentclassMethodParent{
	public void parentMethod() {
		System.out.println("parent child class method");
		super.parentMethod();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentclassMethodchild p=new ParentclassMethodchild();
		p.parentMethod();

	}

}
