package Day_3;

public class UC_6EmpWageMaxHrs {

	public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int EMP_WAGE_PER_HOUR = 20;
    public static final int MONTH_OF_WORKING_DAYS = 2;
    public static final int WOR_HRS_IN_MONTH = 100;
	//private static String totalWorkingHrs;
	
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			//computeEmpWage();
	
        int totalEmpWage = 0;
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;
	    int empHrs; 
	    int empwage = 0;   	 
	    	System.out.println("Total Working Hours Or Days");
	    	
		while (totalEmpHrs <= WOR_HRS_IN_MONTH && totalWorkingDays < MONTH_OF_WORKING_DAYS){
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random()*10)%3;

		switch (empCheck) {
	         case 1:IS_FULL_TIME:
	          empHrs = 8;
	    	  break;
	    	 case 2:IS_PART_TIME:
			  empHrs = 4;
	    	  break;
	    	 default:
			  empHrs = 0;
	     }
		totalEmpHrs += empHrs;
		System.out.println("Day:" + totalWorkingDays +" "+ "Emp Hr:"+empHrs);
    
		int empWage = empHrs*EMP_WAGE_PER_HOUR;
		System.out.println("Total Emp Wage In Month:"+empWage);
	}
    
	 }   
}

