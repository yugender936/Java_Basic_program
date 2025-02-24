import java.util.Scanner;
class SumActOfDigits
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in); 
	   System.out.println("Enter any Number");
	   int n = sc.nextInt();
	   int m = n;
	   int sum = 0 ;
	   int prod = 1;
	   while(n > 0){
		   int rem = n % 10;
		   sum = sum + rem;
		   n = n / 10;
	   }
	   if(sum == m){
		   System.out.println("Sum and given number are equal");
	   }
	   else{
		   System.out.println("Not Equal");
	   }
    }
}
