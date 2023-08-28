class Salary{
	public static void main(String args[]){
		double hrs = Double.valueOf(args[0]).doubleValue();
		double rate = Double.valueOf(args[1]).doubleValue();
		double pay = hrs*rate;
		System.out.println("paycheck of "+pay+" is given.");

		if (rate<12.5){
			System.err.println("Rate is too low. Better quit.");
		}
		if(hrs<168){
			System.err.println("Guess you are not working enough.");
		}
	}
}