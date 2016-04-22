import java.util.Scanner;

/**
 *  Purpose of class is to handle input from user.
 * @author Robert
 */
public class InputReader {
    
    private Scanner reader;
    
    public InputReader(){
        
        reader = new Scanner(System.in);
    }
    
    /**
     * Method to get input from user as String.
     * @return returns user input as String.
     */
    public String getInputString(){
        System.out.print(">");
        return reader.nextLine();
    }
    
    /**
     * Method to get input from user as String. Includes a message to the user.
     * @param message String to show user before getting input.
     * @return returns user input as String.
     */
    public String getInputString(String message){
        System.out.println(message);
        System.out.print(">");
        return reader.nextLine();
    }
    
    /**
     * Method to get input from user as Int.
     * @return returns user input as Int.
     * 
     */
    public int getInputInt(){
        System.out.print(">");
        return reader.nextInt();
    }
    
    /**
     * Method to get input from user as Int
     * @param message String to show user before input
     * @return returns user input as Int.
     */
    public int getInputInt(String message){
        System.out.println(message);
        System.out.print(">");
        return reader.nextInt();
    }
}
