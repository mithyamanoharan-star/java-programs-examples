package hierarchicalinheritance;

public class Son extends Father {
	public void sonExample() {
		System.out.println("he can dance");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s=new Son();
		s.sonExample();
		s.fatherExample();

	}

}
