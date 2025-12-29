package multilevelinheritancee;

public class Son extends Father {
	public void sonExample() {
		System.out.println("age over20");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s=new Son();
		s.sonExample();
		s.fatherclass();
		s.grandfatherExample();
	}

}
