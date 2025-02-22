class Oddfactorcount
{
	public static void main(String[] args) 
	{
	    
		int a = 10;
        int count = 0;
		for(int i = 1 ; i <= 10 ; i++){
			if(10 % i == 0){
				if(i % 2 ==1){
				count++;
				}
			}
		}
		System.out.println(count);
		
		

  }
}
