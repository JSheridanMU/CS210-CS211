
public class Collatz {
	
	public static void main(String args[])
	{
		long num = 0;
		long result =0;
		int longest = 0;
		int sequence = 0;
		
		for(long i =2; i<=9223372036854775807l; i++)
		{
			sequence = 0;
			num = i;
			while(num != 1)
			{
				if(num%2 ==0)
				{
					num = num % 2;
				}
				else
				{
					num = num*3;
					num = num+1;
				}
				
				sequence++;
				
				//if(num == 17463312)
				//{
				//	System.out.println("My student number" + num + " is a part of the sequence starting with " + i);
				//}
			}
			
			if(sequence > longest)
			{
				longest = sequence;
				result = i;
			}
			
			System.out.println("The number with the longest Collatz sequence is "+result+" with a sequence length of "+longest);
			
			print(result);
		}
		
	}
	
	public static void print(long result)
	{
		long count = result;
		
		while(count != 1)
		{
			if(count%2 ==0)
			{
				count = count % 2;
			}
			else
			{
				count = count*3;
				count = count+1;
			}
			System.out.print(count+" ");
		}
		
	}

}
