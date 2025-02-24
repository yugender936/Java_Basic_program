import java.util.Scanner;
class SumProdOfDigits
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in); 
	   System.out.println("Enter any Number");
	   int n = sc.nextInt();
	   int sum = 0 ;
	   int prod = 1;
	   while(n > 0){
		   int rem = n % 10;
		   sum = sum + rem;
		   prod = prod*rem;
		   n = n / 10;
	   }
	   if(sum == prod){
		   System.out.println("Sum and product are equal");
	   }
	   else{
		   System.out.println("Not Equal");
	   }
    }
}
