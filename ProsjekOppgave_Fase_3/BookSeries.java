
/**
 * The Book series class represents a given book. And contains all the information about it. It contains
 * information about the author, the second name of a book (if it has a prequal) and release date.
 * 
 * @author vegard eidem 
 * @version 08.04-16
 */
public class BookSeries extends Literature
{
    // instance variables - replace the example below with your own
    
    
    private String author;
    private int releases;
    private int releaseDate;

    /**
     * Constructor for objects of class BookSeries
     */
    public BookSeries(String title, String publisher, String Author, int releases, int releaseDate)
    {
        super(title, publisher);
        this.author = author;
        this.releases = releases;
        this.releaseDate = releaseDate;
        
    }

    /**
     * Get method for the author variable. 
     * 
     * @return author       returnes the name of the author
     */
    public String getAuthor(){
        return author;
    }
    
    /**
     * Get method for the secondTitle variable
     * Returns the second title. E.i. First Name - Second Name. Represents the name
     * of a follow up book in the series.
     * 
     * @return secondTitle      Returns the second name of a follow up for a book
     */
    public int getReleases(){
        return releases;
    }
    
    /**
     * Get method for the release date of the BookSeries
     * 
     * @return releaseDate      Date of the released book.
     */
    public int getReleaseDate(){
        return releaseDate;
    }
    
    /**
     * Get method for a string of information about the given book series.
     * 
     * @return returnString     a string of information
     */
    public String getInfo(){
        String returnString = "";
        
        //returnString += getLiteratureInfo();
        returnString += "Number of releases: " + getReleases() + "." + "\n";
        returnString += "Releasedate: " + getReleaseDate() + "." + "\n" + "\n";
        
        return returnString;
    }
}
