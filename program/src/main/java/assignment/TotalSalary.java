package assignment;

public class TotalSalary extends CalculateSalary {
	public void totalSalary() {
		double total=basicPay+hra-pf+deduction+bonus;
		System.out.println("Total salary :" +total);
		System.out.println("SALARY SLIP");
		System.out.println("Basic pay : "+basicPay);
		System.out.println("Deduction : "+deduction);
		System.out.println("Hra : "+hra);
		System.out.println("pf : "+pf);
		System.out.println("Bonus: "+bonus);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TotalSalary total=new TotalSalary();
		total.employeeDetails(100,50,20);
		total.calculate();
		total.totalSalary();
		

	}

}
