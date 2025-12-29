package aggregation;

public class AggregationClass{
	int l;
	String str;
	AgregationHasA a;
	public AggregationClass(int l,String str,AgregationHasA a) {
		this.l=l;
		this.str=str;
		this.a=a;
		
	}
	public void aggregationMethod() {
		System.out.println(l);
		System.out.println(str);
		a.agregationMethodEx();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgregationHasA agr=new AgregationHasA(12,"hai");
		AggregationClass ag=new AggregationClass(10,"hello",agr);
		ag.aggregationMethod();
		
		
		

	}

}
