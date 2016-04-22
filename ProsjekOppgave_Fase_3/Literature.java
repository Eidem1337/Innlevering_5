
/**
 * Write a description of class Literature here.
 * The literature class is the superclass for the different types of literatures. It cointains the info about the 
 * different types of literatures title and publisher
 * 
 * @author vegard eidem
 * @version 08.04-16
 */
public class Literature
{
    // instance variables - replace the example below with your own
    //Title of the literature
    private String title;
    //Author of the literature
    private String publisher;

    
    /**
     * Constructor for objects of class Literature
     */
    public Literature(String title, String publisher)
    {
        this.title = title;
        this.publisher = publisher;
    }

        /**
     * Returns the title of the book.
     *
     * @return title;
     */
    public String getTitle()
    {
        // put your code here
        return title;
    }

         /**
     * Returns the name of the Author
     *
     * @return     author
     */
    public String getPublisher()
    {
        // put your code here
        return publisher;
    }
    
    /**
     * Returns a string with info about the literature
     * 
     * @return returnString
     */
    public String getLiteratureInfo(){
        String returnString = "";
        returnString += "Title: " + getTitle() + " ";
        returnString += "by: " + getPublisher() + " ";
        
        return returnString;
    }
    
    
    
    
    
}
