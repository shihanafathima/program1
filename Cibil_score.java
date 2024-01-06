package java_program;

import java.io.DataInputStream;
import java.io.IOException;

public class Cibil_score {
	String name;
	long phn;
	int panc,sal,loan,tot_amt,cibil_score;
	DataInputStream ds=new DataInputStream(System.in);
	void get()throws IOException
	{
		System.out.println("Enter the Name:");
		name=ds.readLine();
		System.out.println("Enter the phone number:");
		phn=Long.parseLong(ds.readLine());
		System.out.println("Enter the pan card number:");
		panc=Integer.parseInt(ds.readLine());
		System.out.println("Enter the salary:");
		sal=Integer.parseInt(ds.readLine());
		System.out.println("Enter the number of loan taken:");
		loan=Integer.parseInt(ds.readLine());
		System.out.println("Enter the total amount paying for loan per month:");
		tot_amt=Integer.parseInt(ds.readLine());
		System.out.println("Enter the cibil_score:");
		cibil_score=Integer.parseInt(ds.readLine());
	}
	
	public static void main(String[] args) throws IOException
	{
		Cibil_score1 ds1=new Cibil_score1();
		ds1.get();
		ds1.calculate();
	}

}
class Cibil_score1 extends Cibil_score 
{
	int bal_amt;
	void calculate()
	{
		bal_amt=sal-tot_amt;
		if(bal_amt>=30000)
		{
			if(cibil_score<=650)
			{
				System.out.println("Poor - This represents the lowest CIBIL Score range.so not possible to get loan");
			}
			else if(cibil_score>=650 && cibil_score<=699)
			{
				System.out.println("Average- This cibil score range meeting payment deadlines. It still reflects a challenge to get loan");
			}
			else if(cibil_score>=700 && cibil_score<=749)
			{
				System.out.println("Good - Indicates good credit behaviour, Loan approval");
			}
			else if(cibil_score>=750 && cibil_score<=900)
			{
				System.out.println("Excellent- CIBIL score in this range makes it easier to secure loans with lower interest rates. Loan approved ");
			}
			else
			{
				System.out.println("Salary is low then interest rate. Not possible to get loan");
			}
		}
		else
		{
			System.out.println("Salary is low then interest rate. Not possible to get loan");
		}
	}
}

