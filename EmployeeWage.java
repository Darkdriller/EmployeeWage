class EmployeeWage {
		public static final int EMP_RATE_PER_HOUR = 20;
		public static final int IS_FULL_TIME = 2;
		public static final int IS_PART_TIME = 1;
                public static final int WORKING_DAYS = 30;
                public static final int MAX_HRS = 100;
	public static void main(String[] args) {
System.out.println("Welcome to Employee Wage Program");
                int totalHrs = 0;
		int empHrs = 0;
		int empWage = 0;
                int totalWage = 0;
                int days = 0;
                while (totalHrs <= MAX_HRS && days < WORKING_DAYS){
                      days++;
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
                         totalHrs += empHrs;
                         System.out.println("Day : " + days + " Emp Hrs: " + empHrs);
                }       
                totalWage =  totalHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Employee Wage: " + totalWage);
                }
}
