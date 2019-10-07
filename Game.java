import java.util.*;
// 17463312 & 17393253
public class Game {
	
    public static void main(String args[]){
    	FileIO reader = new FileIO();
        Scanner scan = new Scanner(System.in);

        String[] dictionary = reader.load("X://dictionary.txt");
        int index = new Random().nextInt(dictionary.length);
        String random = (dictionary[index]);
        random = random.substring(0,random.length()-1);
        System.out.println("Your word is: "+random);
        
        for(int i = 0; i < random.length()-1;i++){
        	System.out.print("_ ");
        }
        
        int lives = 10;
        String[] guessed = new String[random.length()];
        while(lives != 0){
        	System.out.println("");
        	System.out.println("Please enter a guess");
        	String guess = scan.nextLine();
        	
        	if(random.equals(guess)){
        		System.out.println("Congratulations you WIN!");
        		break;
        		
        	}else if(guess.length() == 1){
        		if(check(guess,random)){
        			guessed = correct(guess,random,guessed);
        			
        			for(int j = 0; j < guessed.length;j++){
        				if(guessed[j] == null){
        					
        					System.out.print("_ ");
        				}else{
        					System.out.print(guessed[j].charAt(0));
        				}
        			}
        		}else{
        			lives--;
        			System.out.println("You have lost a life");
        			lifeLost(lives);
        		}
        	}else{
        		lives--;
        		System.out.println("You have lost a life");
        		lifeLost(lives);
        	}
        }
        
        if(lives == 0){
        	System.out.println("You have LOST!");   
        }
    }    
    
    public static boolean check(String guess, String random){
    	char letter = guess.charAt(0);
    	for(int i = 0;i<random.length()-1;i++){
    		if(letter == random.charAt(i)){
    			return true;
    		}
    	}
    	return false;
    }
    
    public static String[] correct(String guess, String random, String[] guessed){
    	char letter = guess.charAt(0);
    	for(int i = 0;i < random.length();i++){
    		if(letter == random.charAt(i)){
    			guessed[i] = guess;
    		}
    	}
    	return guessed;
    }
    
   public static void lifeLost(int lives){
	   if(lives == 9){
		   System.out.println("=========");
	   }else if(lives == 8){
		   System.out.println("      |  ");
		   System.out.println("      |  ");
		   System.out.println("      |  ");
		   System.out.println("      |  ");
		   System.out.println("      |  ");
		   System.out.println("=========");
	   }else if(lives == 7){
		   System.out.println("  +---+");
		   System.out.println("      |  ");
		   System.out.println("      |  ");
		   System.out.println("      |  ");
		   System.out.println("      |  ");
		   System.out.println("      |  ");
		   System.out.println("=========");
	   }else if(lives == 6){
		   System.out.println("  +---+");
		   System.out.println("  |   |  ");
		   System.out.println("      |  ");
		   System.out.println("      |  ");
		   System.out.println("      |  ");
		   System.out.println("      |  ");
		   System.out.println("=========");
	   }else if(lives == 5){
		   System.out.println("  +---+");
		   System.out.println("  |   |  ");
		   System.out.println("  O   |  ");
		   System.out.println("      |  ");
		   System.out.println("      |  ");
		   System.out.println("      |  ");
		   System.out.println("=========");
	   }else if(lives == 4){
		   System.out.println("  +---+");
		   System.out.println("  |   |  ");
		   System.out.println("  O   |  ");
		   System.out.println("  |   |  ");
		   System.out.println("      |  ");
		   System.out.println("      |  ");
		   System.out.println("=========");
	   }else if(lives == 3){ 
		   System.out.println("  +---+");
		   System.out.println("  |   |  ");
		   System.out.println("  O   |  ");
		   System.out.println(" ||   |  ");
		   System.out.println("      |  ");
		   System.out.println("      |  ");
		   System.out.println("=========");
	   }else if(lives == 2){
		   System.out.println("  +---+");
		   System.out.println("  |   |  ");
		   System.out.println("  O   |  ");
		   System.out.println(" |||  |  ");
		   System.out.println("      |  ");
		   System.out.println("      |  ");
		   System.out.println("=========");
	   }else if(lives == 1){
		   System.out.println("  +---+");
		   System.out.println("  |   |  ");
		   System.out.println("  O   |  ");
		   System.out.println(" |||  |  ");
		   System.out.println(" [    |  ");
		   System.out.println("      |  ");
		   System.out.println("=========");
	   }else if(lives == 0){
		   System.out.println("  +---+");
		   System.out.println("  |   |  ");
		   System.out.println("  O   |  ");
		   System.out.println(" |||  |  ");
		   System.out.println(" [ ]  |  ");
		   System.out.println("      |  ");
		   System.out.println("=========");
	   }
   }
    
    
    

}
