package Oops.Abstract;
import java.util.*;

public class Dummy{
	public static abstract class Employee {
		String name;
		int empid;

		Employee(String name,int empid){
			this.name = name;
			this.empid = empid;
		}

		void markAttendence() {
			System.out.println(this.name + " is present");
		}

		 abstract void doWork();
		}


		public static class HrEmployee extends Employee{
			ArrayList<Integer> payroll;
			HrEmployee(ArrayList<Integer> payroll,String name,int empid)
			{
				super(name,empid);
				this.payroll = payroll;
			}
			
			void doWork() {
				System.out.println(this.name + " provide the payroll to the employee..");
			}
			
		} 
		
		
		public static void main(String[] args) {
			Employee obj = new HrEmployee(null,"Ajvider Singh",12);
		    obj.markAttendence();
		}

}

