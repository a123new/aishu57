package com.Day1;

/*UC1: Check Employee is Present or Absent Use (RANDOM) for Attendance Check

UC2: Calculate Daily Wage Employee Wage Assume employee wage to be Rs 125/= per hour & Number of hours for Full Day = 8 hours

UC3: Add Part time employee and Wage Assume part time hours be 4

UC4: Solving using Case statement

UC5: Calculate Wages for a month Assume 26 days in a month

UC6: Calculate Wages till a condition of total working hours or num of days is reached for a month Assume 200 hours and 25 days*/

public class EmployeeWage {

	static final int IS_FULL_TIME=1;
	static final int IS_PART_TIME=2;
	static final int EMP_RATE_PER_HOUR=125;
	static final int MAX_HRS_INA_MONTH=100;
	
	public static void main(String[] args) {
		
		int NUM_WORKING_DAYS = 0;
		int empHrs=0, empWage=0, totalEmpWage=0,totalEmpHrs=0,totalWorkingDays=0;
		
		while(totalEmpHrs<MAX_HRS_INA_MONTH || totalWorkingDays<NUM_WORKING_DAYS ) {
			totalWorkingDays++;
			
			double empCheck=Math.floor(Math.random()*10)%3;
			
			System.out.println("Employee Attendence Check" + empCheck);
			
			switch ((int)empCheck) {
			case 1: IS_FULL_TIME:
				empHrs=8;
			    break;
			    
			case 2: IS_PART_TIME:
				empHrs=4;
			    break;
			    
			    default:
			    	empHrs=0;
			}
			
			totalEmpHrs=totalEmpHrs + empHrs;
			empWage=empHrs*EMP_RATE_PER_HOUR;
			
			System.out.println("Employee Wage is" + empWage);
			totalEmpWage = totalEmpWage + empWage;
		}
		    System.out.println("Total Employee Wage" + totalEmpWage);
		
		
	}

}

