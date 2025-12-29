package superkeywordexample;

public class SuperkeywordChild extends SuperkeywordParent{
	int i=20;
	public void superkeyword() {
		System.out.println(i);
		System.out.println(super.i);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperkeywordChild s=new SuperkeywordChild();
		s.superkeyword();
		
		

	}

}
