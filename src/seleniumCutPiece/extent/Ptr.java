package seleniumCutPiece.extent;

import java.util.Scanner;

public class Ptr {

	public static void main(String[] args) {
		
		
		
			Scanner input =new Scanner(System.in);
			System.out.println("enter the principle amount:");
			double pamt=input.nextDouble();
			System.out.println("enter the interest:");
			double intrate=input.nextDouble();
			System.out.println("enter the duration:");
			int months=input.nextInt();
			double intamnt=totalAmount(pamt, intrate, months);
			double total=intamnt+pamt;
			System.out.println("total payable is :"+total);

		}
		static double totalAmount(double principle,double interest,int time)
		{
			double totalAmnt=(principle*interest*time)/100;
			return totalAmnt;}


	}

