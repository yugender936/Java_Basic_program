import java.util.Scanner;
class EvenProdOfDigits
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in); 
	   System.out.println("Enter any Number");
	   int n = sc.nextInt();
	   int m = n;
	   int prod = 1;
	   int count = 0;
	   int count1 = 0;
	   while(n > 0){
		   count++;
		   n = n / 10;
	   }
	   if(count % 2 == 0){
           while(m > 0){
			   count1++;
			   int rem = m % 10;
			   if(count1 % 2 == 1){
                   prod = prod * rem;
			   }
			   m = m / 10;
		   }
	   }
	   else{
		   while(m > 0){
			   count1++;
			   int rem = m % 10;
			   if(count1 % 2 == 0){
				   prod = prod * rem;
			   }
			   m = m / 10;
		   }
	   }
	   System.out.println(prod);
    }
}
