import java.util.Scanner;
class SumOfDigits
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in); 
	   System.out.println("Enter any Number");
	   int n = sc.nextInt();
	   int sum = 0;
	   while(n > 0){
		   int rem = n % 10;
		   sum = sum + rem;
		   n = n / 10;
	   }
	   System.out.println(sum);
    }
}
