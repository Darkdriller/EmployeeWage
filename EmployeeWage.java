
class EmployeeWage {
        class Company {

            protected final String companyName;
            protected final int empRate;
            protected final int workingDays;
            protected final int maxHour;
            protected int totalEmpWage;

            public Company(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
                this.companyName = company;
                this.empRate = empRatePerHour;
                this.maxHour = maxHoursPerMonth;
                this.workingDays = numOfWorkingDays;
            }

            public void setTotalEmpWage(int totalEmpWage) {
                this.totalEmpWage = totalEmpWage;
            }

            public String toString() {
                return "Total Employee Wage for Company: " + companyName + " is : " + totalEmpWage;
            }
        }
		public static final int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;

        private int totalCompanies = 0;


        private Company[] companyArray;

        public EmployeeWage(int SizeOfCompanyList) {
            companyArray = new Company[SizeOfCompanyList];
        }

        private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
            companyArray[totalCompanies] = new Company(company, empRatePerHour, numOfWorkingDays,
                    maxHoursPerMonth);
            totalCompanies++;
        }


        private void computeEmpWageForAll() {
            for (int i = 0; i < totalCompanies; i++) {
                companyArray[i].setTotalEmpWage(this.empWageCalculation(companyArray[i]));
                System.out.println(companyArray[i]);
            }
        }





            public int empCheck(){
               return (int) Math.floor(Math.random() * 10) % 3;
             }
             
        public int empWageCalculation(Company company){
            System.out.println("Welcome to Employee Wage Program");
                         int totalHrs = 0;
                         int empHrs = 0;
                         int empWage = 0;
                         int days = 0;
                         int totalWage = 0;
                         while (totalHrs <= company.maxHour && days < company.workingDays) {
                             days++;
                             switch (empCheck()) {
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
                         totalWage = totalHrs * company.empRate;
                         System.out.println("Total Employee Wage: " + totalWage);

                         return totalHrs * company.empRate ;
        }
	public static void main(String[] args) {

        EmployeeWage EmpWageTool = new EmployeeWage(5);
        EmpWageTool.addCompanyEmpWage("Amazon", 25, 25, 100);
        EmpWageTool.addCompanyEmpWage("Paypal", 25, 25, 80);
        EmpWageTool .addCompanyEmpWage("Google", 25, 30, 85);
        EmpWageTool.computeEmpWageForAll();
        }
}
