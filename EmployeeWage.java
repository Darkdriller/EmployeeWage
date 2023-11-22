class EmployeeWage {
		public static final int EMP_RATE_PER_HOUR = 20;
		public static final int IS_FULL_TIME = 2;
		public static final int IS_PART_TIME = 1;
                public static final int WORKING_DAYS = 30;
	public static void main(String[] args) {
System.out.println("Welcome to Employee Wage Program");
               
		int empHrs = 0;
		int empWage = 0;
                int totalWage = 0;
                for (int day = 0; day < WORKING_DAYS; day ++){
                      int empcheck = (int) Math.floor(Math.random() * 10) % 3;
                      switch(empcheck){
                                       case IS_FULL_TIME:
                                           System.out.println("Employee is Present and is Full Time");
                                           empHrs = 8;
                                           break;
                                       case IS_PART_TIME:
                                           System.out.println("Employee is Present and is Half Time");
                                           empHrs = 4;
                                           break;
                                       default:
                                           System.out.println("Employee is absent");
                                           empHrs = 0;

                         }
                         empWage = empHrs * EMP_RATE_PER_HOUR;
                         System.out.println("Employee Wage: " + empWage);
                         totalWage += empWage;
                }
		System.out.println("Total Employee Wage: " + totalWage);
                }
}
