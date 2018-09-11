import java.util.Scanner;
class BMI
{
	public static void main(String[] args) 
	{ Scanner sc=new Scanner(System.in);
		System.out.print("Enter  Weight: ");
		    double w=sc.nextDouble();
		System.out.print("Enter Height: ");
		    double h=sc.nextDouble();
			double H=h/100;
			    H=H*H;

		double bmi=w/H;
        System.out.print("BMI = "+bmi);

	}
}
