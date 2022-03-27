package com.greatlearning.driverModel;

import com.greatlearning.adminModel.*; 
import com.greatlearning.hrModel.*;
import com.greatlearning.techModel.*;

public class DriverClass {

	public static void main(String[] args) {
		
		AdminDepartment Admin=new AdminDepartment();
		
		HrDepartment Hr=new HrDepartment();
		
		TechDepartment Tech=new TechDepartment();
		
		
		
		
		
		System.out.println("Welcome to "+Admin.departmentName()+"\n"+
				Admin.getTodaysWork()+"\n" +Admin.getWorkDeadline()+ "\n" +Admin.isTodayAHoliday()+"\n"
				+"\n" +"Welcome to "+Hr.departmentName()+"\n"+Hr.doActivity()+"\n"+Hr.getTodaysWork()+
				"\n"+Hr.getWorkDeadline()+"\n"+Hr.isTodayAHoliday()+"\n"+"\n"+"Welcome to "+Tech.departmentName()+"\n"+
				Tech.getTodaysWork()+"\n"+Tech.getWorkDeadline()+"\n"+Tech.getTechStackInformation()+"\n"+Tech.isTodayAHoliday()
				);
				
		
				
		

	}

}