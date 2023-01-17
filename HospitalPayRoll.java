package general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HospitalPayRoll {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<Hospital_Employee> list = new ArrayList<>();
		boolean flag=true;
		
		while(flag)
		{
			System.out.println("Enter the details seperated by comma(,)");
			String a=scanner.next();
			try {
			String[] x=a.split(",");
		     int id=Integer.parseInt(x[0]);
		     String des=(x[1]);
		     int working=Integer.parseInt(x[2]);
		     int overtime=Integer.parseInt(x[3]);
		     int salary=0;
		     if(des.equalsIgnoreCase("Doctor"))
		     	{
		    	 salary=working*500+overtime*1000;
		     	}
		     else if(des.equalsIgnoreCase("Nurse"))
			    {
			    salary=working*150+overtime*300;
			    }
		     else if(des.equalsIgnoreCase("Reception"))
			    {
			    salary=working*100+overtime*200;
			    }
		     else {
		    	 System.out.println("Enter Proper Designation");
		     }
		     
		    Hospital_Employee employee=new Hospital_Employee();
				employee.setId(id);
				employee.setSalary(salary);
				employee.setDesignation(des);
				
				list.add(employee);
		     
			}
			catch (Exception e) {
				System.out.println("Enter Proper Details");
			}
			
			System.out.println("Do you want to Continue(Y/N): ");
			String val=scanner.next();
			if(!val.equalsIgnoreCase("Y"))
			{
				flag=false;
			}
		}

		Collections.sort(list);
		
		for(Hospital_Employee employee:list)
		{
			System.out.println("Id : "+employee.getId());
			System.out.println("Designation : "+employee.getDesignation());
			System.out.println("Salary : "+employee.getSalary());
			System.out.println("===============================");
		}
		scanner.close();
	}
}

class Hospital_Employee implements Comparable<Hospital_Employee>
{
	private int id;
	private String designation;
	private int salary;

	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public int compareTo(Hospital_Employee o) {
		if(o.salary<this.salary)
		{
			return -1;
		}
		return 0;
	}


}
