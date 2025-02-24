import java.util.Scanner;
class ProdOfDigits
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in); 
	   System.out.println("Enter any Number");
	   int n = sc.nextInt();
	   int prod = 1;
	   while(n > 0){
		   int rem = n % 10;
		   prod = prod*rem;
		   n = n / 10;
	   }
	   System.out.println(prod);
    }
}
