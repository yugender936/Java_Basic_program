import java.util.Scanner;
class AscDigits
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in); 
	   System.out.println("Enter any Number");
	   int n = sc.nextInt();
	   int m = 1;
	   int temp = n;
	   int asc = 0;
	   while(m < 9){
		   temp = n;
		   while(temp > 0){
			   int rem = temp % 10;
			   if(m == rem){
				   asc = asc * 10 + rem;
			   }
			   temp = temp / 10;
		   }
		   m++;
	   }
	   System.out.println(asc);
    }
}
