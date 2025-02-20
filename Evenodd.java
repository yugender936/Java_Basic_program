class Evenodd
{
	public static void main(String[] args) 
	{
	    
		int n = -30;
		if(n == 0){
			System.out.println("Number is zero");
		}
		if(n % 2 == 0)
			{
			if(n > 0)
				{
				System.out.println("Even postive number");
			    }
			else{
				System.out.println("Even Negative Number");
			    }
		    }
			else{
				if(n > 0){
					System.out.println("Odd positive number");
				}
				else{
					System.out.println("Odd negative Number");
				}
			}

  }
}
