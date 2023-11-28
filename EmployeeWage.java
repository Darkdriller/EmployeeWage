import java.util.ArrayList;

interface IEmployeeWageComputation {
    void addCompanyEmpWage(String company, int empRate, int workingDays, int maxHour);
    void computeEmpWageForAll();
}
class EmployeeWage implements IEmployeeWageComputation {
        static class Company {

            protected final String companyName;
            protected final int empRate;
            protected final int workingDays;
            protected final int maxHour;
            protected int totalEmpWage;
            protected ArrayList<Integer> dailyWageList;

            public Company(String company, int empRate, int workingDays, int maxHour) {
                this.companyName = company;
                this.empRate = empRate;
                this.maxHour = maxHour;
                this.workingDays = workingDays;
                this.dailyWageList = new ArrayList<Integer>();
            }

            public void setTotalEmpWage(int totalEmpWage) {
                this.totalEmpWage = totalEmpWage;
            }
            public void addDailyEmpWage(int dailyWage) {
                this.dailyWageList.add(dailyWage);
            }
            @Override
            public String toString() {
                return "Total Employee Wage for Company: " + companyName + " is : " + totalEmpWage;
            }
        }
		public static final int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;

        private int totalCompanies = 0;


        private static ArrayList<Company> companyArray;

        public EmployeeWage() {
            companyArray = new ArrayList<Company>();
        }
        @Override
        public void addCompanyEmpWage(String company, int empRate, int workingDays, int maxHour) {
            companyArray.add(new Company(company, empRate, workingDays,
                    maxHour));
            totalCompanies++;
        }

        @Override
        public void computeEmpWageForAll() {
            for (int i = 0; i < totalCompanies; i++) {
                companyArray.get(i).setTotalEmpWage(this.empWageCalculation(companyArray.get(i)));
                System.out.println(companyArray.get(i));
            }
        }





            public int empCheck(){
               return (int) Math.floor(Math.random() * 10) % 3;
            }
             
        public int empWageCalculation(Company company){
            System.out.println("Welcome to Employee Wage Program");
                         int totalHrs = 0;
                         int empHrs;
                         int days = 0;
                         int totalWage;
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
                             company.addDailyEmpWage(empHrs*company.empRate);
                             totalHrs += empHrs;
                             System.out.println("Day : " + days + " Emp Hrs: " + empHrs);
                         }
                         totalWage = totalHrs * company.empRate;
                         System.out.println("Total Employee Wage: " + totalWage);

                         return totalHrs * company.empRate ;
        }

        public int getTotalWageByCompany(String companyName) {
            for (Company company : companyArray) {
                if (company.companyName.equals(companyName)) {
                    return company.totalEmpWage;
                }
            }
            return -1; // Return -1 or some other indicator if the company is not found
        }
	public static void main(String[] args) {

        IEmployeeWageComputation empWageTool = new EmployeeWage();
        empWageTool.addCompanyEmpWage("Amazon", 25, 25, 100);
        empWageTool.addCompanyEmpWage("Paypal", 25, 25, 80);
        empWageTool.addCompanyEmpWage("Google", 25, 30, 85);
        empWageTool.computeEmpWageForAll();
        System.out.println("Total Wage for Amazon: " + ((EmployeeWage) empWageTool).getTotalWageByCompany("Amazon"));
        System.out.println("Total Wage for Paypal: " + ((EmployeeWage) empWageTool).getTotalWageByCompany("Paypal"));
        System.out.println("Total Wage for Google: " + ((EmployeeWage) empWageTool).getTotalWageByCompany("Google"));
        System.out.println("Total Wage for Flipkart: " + ((EmployeeWage) empWageTool).getTotalWageByCompany("Flipkart"));
        }
}
