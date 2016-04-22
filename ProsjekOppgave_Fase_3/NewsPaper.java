
/**
 * The news paper class represents a given news paper. It contains information about the book, such as: title,
 * publisher, genre and the number of annual publications of the newspaper.
 * 
 * @author vegard eidem 
 * @version 08.04-16
 */
public class NewsPaper extends Literature
{
    // instance variables - replace the example below with your own
    
    //Title of the book

    private String genre;
    private int releasesPerYear;
    private String category;
    /**
     * Constructor for objects of class NewsPaper
     */
    public NewsPaper(String title, String publisher, int releasesPerYear, String genre, String category)
    {
        super(title, publisher);
        //Type of News paper e.g. sports, news, travels ect.
        this.genre = genre;
        this.releasesPerYear = releasesPerYear;
        this.category = category;
       
    }
    
    /**
     * get method for the newspapers genre. e.i. sports, news ect.
     * 
     * @return genre    returns the newspapers genre in a string
     */
    public String getNewsPaperGenre(){
        return genre;
    }
    
    /**
     * Get method for the number of annual publications of a news paper. e.i. 6 , 12 or 4
     * 
     * @return annualPublications       retuns the integer value of publications every year.
     */
    public int getNewsPaperPublications(){
        return releasesPerYear;
    }
    
    public String getCategory(){
        return category;
    }
           
    
    /**
     * Get method for the news papers info string. Gives a string of all the information about the news paper
     * E.i. Title: New York Times, Publisher: New York News, Genre: Local News Annual publications: 52
     * 
     * @return returnString     returns a string of information about the news paper
     */
    public String getInfo(){
        String returnString = "";
        
        //returnString += getLiteratureInfo();
        returnString += "Genre: " + getNewsPaperGenre() + "." + "\n";
        returnString += "Releases per year: " + getNewsPaperPublications() + "." + "\n";
        returnString += "Category: " + getCategory() + "." + "\n" + "\n";
        
        return returnString;
    }
}
