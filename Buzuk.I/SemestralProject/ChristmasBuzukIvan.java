package ortonormalnivektora;
import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class ChristmasBuzukIvan {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Vanocni_uloha();
    }
    public static void Vanocni_uloha(){
         
        
        christmas();
        System.out.println("");
        System.out.println("    Welcome to this little christmas app");
        System.out.println("    This app allows you to draw a fine christmas star");
        System.out.println("");
        christmas();
        System.out.println("");
        System.out.println("    What kind of star would you like to draw?");
        System.out.println("");
        System.out.println("        Colored :)          White :(");
        System.out.println("           [c]                [w]   ");
        System.out.println("");
        System.out.println("(print out the letter featured under the choice in order to proceed with said choice.");
        char choice  = sc.next().charAt(0);
        switch (choice) {
            case 'c' -> {
                christmas();
                System.out.println("Would you like it to have it to have 1 or 2 colours(zigzag pattern)?");
                System.out.println("");
                System.out.println("        one colour          two colours");
                System.out.println("           [1]                  [2]   ");
                System.out.println("");
                System.out.println("(print out the letter featured under the choice in order to proceed with said choice.");
                char choice2  = sc.next().charAt(0);
            switch (choice2) {
                case '1' ->                     {
                        System.out.println("How big do you want your star to be? (enter a number)");
                        int size = sc.nextInt();
                        System.out.println("What kind of element is your star made of? (enter a symbol)");
                        char pat =  sc.next().charAt(0);
                        System.out.println("What kind of colour does it have?");
                        System.out.println("");
                        System.out.println(" Red  Yellow  Blue  Green  Cyan");
                        System.out.println(" [r]    [y]    [b]   [g]    [c]");
                        System.out.println("");
                        char colou =  sc.next().charAt(0);
                        String colour = "";
                        switch (colou) {
                            case 'r' -> colour = "\u001B[31m";
                            case 'y' -> colour = "\u001B[33m";
                            case 'b' -> colour = "\u001B[34m";
                            case 'g' -> colour = "\u001B[32m";
                            case 'c' -> colour = "\u001B[36m";
                            default -> {
                                    System.out.println("choose one of the availeble options, please");
                                    System.out.println("");
                                    Vanocni_uloha();
                                    }
                        }   System.out.println("There you go");
                        christmas();
                        System.out.println("");
                        printPatternColour(size,pat,colour);
                        christmas();
                    }
                case '2' ->                     {
                        System.out.println("How big do you want your star to be? (enter a number)");
                        int size = sc.nextInt();
                        System.out.println("What kind of element is your star made of? (enter a symbol)");
                        char pat =  sc.next().charAt(0);
                        System.out.println("What kind of colour does its main part have?");
                        System.out.println("");
                        System.out.println(" Red  Yellow  Blue  Green  Cyan");
                        System.out.println(" [r]    [y]    [b]   [g]    [c]");
                        System.out.println("");
                        char colou1 =  sc.next().charAt(0);
                        String colour1 = "";
                        switch (colou1) {
                            case 'r' -> colour1 = "\u001B[31m";
                            case 'y' -> colour1 = "\u001B[33m";
                            case 'b' -> colour1 = "\u001B[34m";
                            case 'g' -> colour1 = "\u001B[32m";
                            case 'c' -> colour1 = "\u001B[36m";
                            default -> {
                                    System.out.println("choose one of the availeble options, please");
                                    System.out.println("");
                                    Vanocni_uloha();
                                    }
                        }   System.out.println("What kind of colour does its secondary part have?");
                        System.out.println("");
                        System.out.println(" Red  Yellow  Blue  Green  Cyan");
                        System.out.println(" [r]    [y]    [b]   [g]    [c]");
                        System.out.println("");
                        char colou2 =  sc.next().charAt(0);
                        String colour2 = "";
                        switch (colou2) {
                            case 'r' -> colour2 = "\u001B[31m";
                            case 'y' -> colour2 = "\u001B[33m";
                            case 'b' -> colour2 = "\u001B[34m";
                            case 'g' -> colour2 = "\u001B[32m";
                            case 'c' -> colour2 = "\u001B[36m";
                            default -> {
                                    System.out.println("choose one of the availeble options, please");
                                    System.out.println("");
                                    Vanocni_uloha();
                                    }
                        }   System.out.println("There you go");
                        christmas();
                        System.out.println("");
                        printPatternColour2(size,pat,colour1,colour2);
                        christmas();
                    }
                default -> {
                        System.out.println("choose one of the availeble options, please");
                        System.out.println("");
                        Vanocni_uloha();
                }
            }
            }
            case 'w' -> {
                System.out.println("How big do you want your star to be? (enter a number)");
                int size = sc.nextInt();
                System.out.println("What kind of element is your star made of? (enter a symbol)");
                char pat =  sc.next().charAt(0);
                christmas();
                System.out.println("");
                printPattern(size,pat);
                christmas();
            }
            default -> {
                    System.out.println("choose one of the availeble options, please");
                    System.out.println("");
            }
        }
        christmas();
    }
    private static void printPattern(int size, char pat) {
	// for loop for the size
	for (int i = 1; i <= size; i++) {
               
		
		
                for (int j = 0; j < size-i; j++) {
                System.out.print(" ");
                
                }
		for (int j = 0; j < i; j++) {
         
                System.out.print(Character.toString(pat)+" ");
                }

		System.out.println("");
	}
        for (int i = size-1; i >= 1; i--) {
		
		

	
                for (int j = 0; j < size-i; j++) {
                System.out.print(" ");
                
                }
		for (int j = 0; j < i; j++) {
         
                System.out.print(Character.toString(pat)+" ");
                }

		System.out.println("");
	}
    }
    private static void printPatternColour2(int size, char pat,String colour1,String colour2) {
	int count = 0;
	for (int i = 1; i <= size; i++) {
               
		
		
                for (int j = 0; j < size-i; j++) {
                System.out.print(" ");
                
                }
		for (int j = 0; j < i; j++) {
                
                    if(count%2 == 0){
                        System.out.print(colour1 +Character.toString(pat)+" ");
                    }
                    else{
                        System.out.print(colour2 + Character.toString(pat)+" "); 
                    }
                 count++;
                }

		System.out.println("");
                
                
	}
        for (int i = size-1; i >= 1; i--) {
		
		

	
                for (int j = 0; j < size-i; j++) {
                System.out.print(" ");
                
                }
		for (int j = 0; j < i; j++) {
         
                    if(count%2 == 0){
                            System.out.print(colour1 +Character.toString(pat)+" ");
                        }
                        else{
                            System.out.print(colour2 + Character.toString(pat)+" "); 
                        }
                    count++;
                }

		System.out.println("");
	}
    }
    private static void printPatternColour(int size, char pat,String colour) {
	
	for (int i = 1; i <= size; i++) {
               
		
		
                for (int j = 0; j < size-i; j++) {
                System.out.print(" ");
                
                }
		for (int j = 0; j < i; j++) {
                
                System.out.print(colour + Character.toString(pat)+" ");
                
                }

		System.out.println("");
                
                
	}
        for (int i = size-1; i >= 1; i--) {
		
		

	
                for (int j = 0; j < size-i; j++) {
                System.out.print(" ");
                
                }
		for (int j = 0; j < i; j++) {
         
                System.out.print(colour + Character.toString(pat)+" ");
                }

		System.out.println("");
	}
    }
    private static void christmas(){
          for (int i = 0; i < 90; i++) {
            System.out.print("\u001B[0m\u001B[32m\u001B[41m * " + "\u001B[0m");
            System.out.print("\u001B[0m\u001B[31m\u001B[42m * " + "\u001B[0m");
           }
    }
}
