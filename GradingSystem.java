package Day3;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			double mark;
			String Name;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your Name and marks");
			Name=sc.next();
			mark= sc.nextDouble();
			if(mark<25) {System.out.println(Name +" is in Grade F.");}
			else if(mark<45){System.out.println(Name +" is in Grade E.");}
			else if(mark<50){System.out.println(Name +" is in Grade D.");}
			else if(mark<60){System.out.println(Name +" is in Grade C.");}
			else if(mark<80){System.out.println(Name +" is in Grade B.");}
			else 
			{System.out.println(Name +" is in Grade A.");}
			System.out.println(mark);
	}

}
