import java.util.Scanner;
import java.lang.Math;
public class Calculator
{
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		System.out.println("*****Welcome to Scientific Calculator*****");
		System.out.println("Operations:");
		System.out.println("[1] Arithmetic");
		System.out.println("[2] Trigonometric");
		System.out.println("[3] Exponential");
		System.out.println("[4] Logarithmic");
		System.out.println("[5] Misc");
		System.out.println();
		System.out.println("Enter the Type of the Operation You Want");
		int select=input.nextInt();
		switch(select)
		{
			case 1:
				arithmetic();
				break;
			case 2:
				trigonometric();
				break;
			case 3:
				exponential();
				break;
			case 4:
				logarithmic();
				break;
			case 5:
				misc();
				break;
		}


	}
	public static void arithmetic()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Select the Operation");
		System.out.println("[1] Addition");
		System.out.println("[2] Subtraction");
		System.out.println("[3] Multiplication");
		System.out.println("[4] Division");
		int operation=input.nextInt();
		System.out.println("Enter the first number");
		int num1=input.nextInt();
		System.out.println("Enter the second number");
		int num2=input.nextInt();
		System.out.println("The result is:");
		switch(operation)
		{
			case 1:
				System.out.println(num1+num2);
				break;
			case 2:
				System.out.println(num1-num2);
				break;
			case 3:
				System.out.println(num1*num2);
				break;
			case 4:
				float x = (float) num1;
				float y = (float) num2;
				System.out.println(x/y);
				break;
			default:
				System.out.println("Invalid Operation");
				break;
		}
	}
	public static void trigonometric()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Select the Operation");
		System.out.println("[1] Sine");
		System.out.println("[2] Cosine");
		System.out.println("[3] Tangent");
		int operation=input.nextInt();
		System.out.println("Enter a value");
		Double value=input.nextDouble();
		double degree = Math.toRadians(value);
		switch(operation) //The results are in Radians
		{
			case 1:
				System.out.println(Math.sin(degree));
				break;
			case 2:
				System.out.println(Math.cos(degree));
				break;
			case 3:
				System.out.println(Math.tan(degree));
				break;
			default:
				System.out.println("Invalid Operation");
				break;
		}

	}
	public static void exponential()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Base");
		float base=input.nextFloat();
		System.out.println("Enter the Exponent");
		float exp=input.nextFloat();
		System.out.println("The result is:"+""+Math.pow(base,exp));
	}
	public static void logarithmic()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value to calculate the logarithm");
		float value=input.nextFloat();
		System.out.println("The Result is:"+""+Math.log(value));
	}
	public static void misc(){
		Scanner input=new Scanner(System.in);
		System.out.println("Select the Operation");
		System.out.println("[1] Fibonacci numbers");
		int operation=input.nextInt();

		switch(operation){
			case 1:
				int num1 = 0;
				int num2 = 1;
				int num3;
				System.out.println("Enter the number of sequence: ");
				int n = input.nextInt();
				System.out.print(num1+" "+num2);
				for(int i=2; i<n; i++){
					num3 = num1 + num2;
					System.out.print( " " + num3);
					num1 = num2;
					num2 = num3;
				}
				break;
		}
	}
}