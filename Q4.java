package COP_LabTest_KartikPaliwal;
import java.util.*;

class Employee{
	int Emp_ID,Emp_Salary,Emp_Age;
	String Emp_name;
	
	void getEmployee() {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter full name of a Employee :");
		Emp_name=Sc.nextLine();
		System.out.println("Enter a Id , Salary and Age of an Employee : ");
		Emp_ID=Sc.nextInt();
		Emp_Salary=Sc.nextInt();
		Emp_Age=Sc.nextInt();
	}
	void showEmployee() {
		System.out.println(" Name   : "+Emp_name);
		System.out.println(" ID     : "+Emp_ID);
		System.out.println(" Salary : "+Emp_Salary);
		System.out.println(" Age    : "+Emp_Age);
		System.out.println();
	}
	void addBonus(int x) {
		System.out.println("New Salaries of  respective Employee is : ");
		Emp_Salary=Emp_Salary+x;
		showEmployee();
		System.out.println();
	}
}

public class Q4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E[]=new Employee[3];
		for(int i=0;i<3;i++) {
			E[i]=new Employee();
		}
		
			for(int i=0;i<3;i++) {
				E[i].getEmployee();
			}
			for(int i=0;i<3;i++) {
				E[i].showEmployee();
			}
System.out.println();
			for(int i=0;i<3;i++) {
				if(E[i].Emp_Age>40) {
					E[i].addBonus(5000);
				}
				else
					E[i].addBonus(1000);
					
			}
		
	}

}
