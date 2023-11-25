class EmployeeWage {
		public static final int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;

                private final String company;
		private final int empRate;
                private final int workingDays;
                private final int maxHour;
                private int totalWage;





                public EmployeeWage(String company, int empRate, int workingDays, int maxHour) {
                               this.company = company;
                               this.empRate = empRate;
                               this.maxHour = maxHour;
                               this.workingDays = workingDays;
                 }

        public int empCheck(){
               return (int) Math.floor(Math.random() * 10) % 3;
             }
             
        public void empWageCalculation(){
         System.out.println("Welcome to Employee Wage Program");
                         int totalHrs = 0;
                         int empHrs = 0;
                         int empWage = 0;
                         int days = 0;
                         while (totalHrs <= this.maxHour && days < this.workingDays){
                               days++; 
                               switch(empCheck()){
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
                         this.totalWage =  totalHrs * empRate;
                         System.out.println("Total Employee Wage: " + totalWage);
                         
                         }


               public String toString() {
	          	return "Total Employee Wage for Company: " + company + " is : " + this.totalWage;
	       }
	public static void main(String[] args) {

         EmployeeWage amazon = new EmployeeWage("Amazon", 25, 20, 100);
         amazon.empWageCalculation();
         System.out.println(amazon);
        }
}
