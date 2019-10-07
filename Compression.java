package Lab1;
import java.util.Scanner;

public class Compression {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a string:");
		
		String sentence = scanner.nextLine();
		scanner.close();
		int[] asciiArray = new int[sentence.length()];
		int[] counts = new int[256];
		
		for(int i=0; i<sentence.length();i++) {
			char character = sentence.charAt(i); 
			int ascii = (int) character; 
			asciiArray[i]=ascii;
		}
		
		for(int i=0; i<asciiArray.length;i++) {
			System.out.print(String.format("%8s", Integer.toBinaryString(asciiArray[i])).replace(' ', '0')+" ");
		}
		
		for(int i=0; i<asciiArray.length;i++) {
			counts[asciiArray[i]] = counts[asciiArray[i]]+1;
		}
		
		System.out.println("\n");
		
		for(int i=0;i< counts.length;i++) {
			if(counts[i]!=0) {
				
				System.out.print("'"+(char)i+"'");
				if(counts[i]>1) {
					System.out.print(" appeared "+counts[i]+" times\n");
				}
				else {
					System.out.print(" appeared "+counts[i]+" time\n");
				}
			}
		}
	}
	
}
	
	
	
	

