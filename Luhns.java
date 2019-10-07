import java.util.Scanner;

public class Luhns {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		if(str.length() > 16 || str.length() < 16)
		{
			System.out.println(str +" is not a valid creditcard number");
		}
		else
		{
			if(check(str) == false)
			{
				System.out.println(str +" is not a valid creditcard number");
			}
			else if(check(str) == true)
			{
				System.out.println(str +" is a valid creditcard number");
			}
		}
		
		sc.close();
		
	}
	
	private static boolean check(String str)
	{
		int[] ar = new int[str.length()];
		int sum = 0;
		
		for(int i =0; i < str.length();i++)
		{
			ar[i] = Integer.parseInt(str.substring(i,i+1));
		}
		
		for(int i = ar.length -2; i >=0 ; i=i-2)
		{
			int j = ar[i];
			j = j*2;
			
			if(9 < j)
			{
				j = j -9;
			}
			
			ar[i] = j;
		}
		
		for(int i = 0; i < ar.length; i++)
		{
			sum += ar[i];
		}
		
		if(sum % 10 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
