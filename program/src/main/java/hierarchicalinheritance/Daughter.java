package hierarchicalinheritance;

public class Daughter extends Father{
	public void daughterExample() {
		System.out.println("she can play");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daughter d=new Daughter();
		d.daughterExample();
		d.fatherExample();
	}

}
