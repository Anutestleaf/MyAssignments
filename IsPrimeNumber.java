package week1.day2;

public class IsPrimeNumber {
	
	public static void main(String[] args){
	
		int a=15;
		int b=0;
		
		System.out.println("Entered number is:" +a);
		
		for(int i=2;i<=a/2;i++) // 2,3,4,5   2<=5 3<=5
		{
			if(a%i==0)  // 11%2 //1 ...etc
			{ //doesnt enter
				b++;
			}
			
		}
		
		if(b>0)
		{ 
			System.out.println("The given number is not a Prime number");
		}
		
		else 
			System.out.println("The given number is a Prime number");
			
	
	}

}
