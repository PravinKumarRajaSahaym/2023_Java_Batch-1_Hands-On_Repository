package oops11;

public class poly6 {
	int n;
	poly6(){
		this(5);
		
	}
	poly6(int n){
		this.n=n;
		this.findFactorial();
	}
	public void findFactorial() {
		int fact=1;
		for(int i=1; i<=n; i++){
			fact = fact *i;
		}
		System.out.println("Factorial :" +fact);
	}

	public static void main(String[] args) {
		poly6 obj=new poly6();

	}

}
