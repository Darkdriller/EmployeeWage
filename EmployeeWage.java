class EmployeeWage {

	public static void main(String[] args) {
                int EMP_RATE_PER_HOUR = 20;
		int empHours = 0;
		int empWage = 0;

		System.out.println("Welcome to Employee Wage Program");

		double empCheck = Math.random(); 
		if(empCheck > 0.5){
			            System.out.println("Employee is present");
                                    empHours = 8;
                        }                     
		else{
			System.out.println("Employee is absent");
                        empHours = 0;
                     }
                empWage =  empHours*EMP_RATE_PER_HOUR;
                System.out.println("Employee's Daily wage is " + empWage);

	}       
}
