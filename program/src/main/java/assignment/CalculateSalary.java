package assignment;

public class CalculateSalary extends Employee{
	double hra;
	double pf;
	public void calculate() {
		hra=0.05*basicPay;
		pf=0.02*basicPay;
	}

}
