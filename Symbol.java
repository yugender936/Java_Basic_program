class Symbol
{
	public static void main(String[] args) 
	{
	    
		char ch = 'a';
		if(!(ch >= '0' && ch <= '9') && !(ch >= 'A' && ch <= 'Z') && 
			!(ch >= 'a' && ch <= 'z'))
		{
			System.out.println("Symbol");
		}
		else{
			System.out.println("Not a Symbol");
		}
  }
}
