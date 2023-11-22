class EmployeeWage {

	public static void main(String[] args) {
System.out.println("Welcome to Employee Wage Program");
		// Constants
		int IS_PART_TIME = 1;
		int IS_FULL_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		// Variables
		int empHrs = 0;
		int empWage = 0;
		// Computation
		double empcheck = Math.floor(Math.random() * 10) % 3;
		if (empcheck == IS_FULL_TIME) {
                        System.out.println("Employee is Present and is Full Time");
			empHrs = 8;
		} else if (empcheck == IS_PART_TIME) {
                        System.out.println("Employee is Present and is Half Time");
			empHrs = 4;
		} else {
                         System.out.println("Employee is absent");

			empHrs = 0;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage: " + empWage);
                }
}
