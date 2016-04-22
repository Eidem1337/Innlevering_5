
/**
 * Book class, cointains variables for the given Books id, title, author and publish year.
 * It also contains get methods to get information about the title, editon, author and release year
 * to the given book.
 * 
 * @author Vegard Eidem og Kristian Kvam 
 * @version 04.03-2016
 */
public class Book extends Literature
{

    //Publish year
    private String author;
    private int releases;
    

    /**
     * Constructor for objects of class Book
     * 
     * @parm id, title, publisher, year
     */
    public Book(String title, String publisher, String author, int releases)
    {
        super(title, publisher);
        this.author = author;
        this.releases = releases;
        
        
        

    }
    /**
     * Get method for the edition
     * 
     * @return edition E.i. edition.1 or edition.2
     */
    public String getAuthor(){
        return author;
    }

    /**
     * Get method for the release year.
     * 
     * @return year   returnes the release year of the book
     */
    public int getReleases()
    {
        // put your code here
        return releases;
    }

    /**
     * Method for getting the information about the given book as a string.
     * 
     * @return The id, title, author and the year published as a string
     */
    public String getInfo()
    {
        String returnString = "";

        //returnString += getLiteratureInfo();
        returnString += "Number of releases: " + getReleases() + "." + "\n";
        returnString += "Author: " + getAuthor() + "." + "\n" + "\n";

        return returnString;
    }
}
