class Salary{
	public void calc(){
		double hours = 40;
		float rate = 5;

		float pay = rate * hours;

		System.out.println("The paycheck is: "+pay+" dollars");
		if (rate<12.5){
			System.err.println("This empl ...");
		}
		if (hours>7*24){
			System.err.println("did this empl...");
		}
	}
	public static void main(String [] args){
		Salary s;
		s.calc();
	}
}