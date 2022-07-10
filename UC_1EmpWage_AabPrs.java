package Day_3;

public class UC_1EmpWage_AabPrs{

      public static void main(String[] args) {

	   int IS_FULL_TIME = 1;
	  
       double empcheck = Math.floor(Math.random()*10)%2;
	     
	     if (empcheck == IS_FULL_TIME)
	        System.out.println("Employe Is Present");
	     else
            System.out.println("Employe Is Absent"); 		 

	     }
}

