
/**
 * The Periodical class contains information about a given book. It contains the title, publisher, genre and
 * number of annual publications.
 * 
 * @author vegard eidem 
 * @version 08.04-16
 */
public class Periodical extends Literature
{
    // instance variables - replace the example below with your own
    private String genre;
    
    private int releasesPerYear;
    private String category;
    /**
     * Constructor for objects of class Periodicals
     */
    public Periodical(String title, String publisher, String genre, String category, int releasesPerYear)
    {
        super(title, publisher);
        this.genre = genre; 
        this.releasesPerYear = releasesPerYear;
        this.category = category;
        
    }

    /**
     * Get method for the periodicals genre. The genre of the periodical. e.i sport, music or cars.
     * 
     * @returns genre   Returns the string of the genre
     */
    public String getPeriodicalGenre(){
        return genre;
    }
    
    /**
     * Get method for the periodicals publications. The number of annual publications of the periodical.
     * 
     * @return annualPublications   number of annual publications
     */
    public int getPeriodicalPublications(){
        return releasesPerYear;
    }
    
    public String getCategory(){
        return category;
    }
    
    /**
     * Get method for the info about the news paper. lists up all information in a string
     * 
     * @return returnString     returns the string with info about the news paper
     */
    public String getInfo(){
        String returnString = "";
        
        //returnString += getLiteratureInfo();
        returnString += "Genre: " + getPeriodicalGenre() + "." + "\n";
        returnString += "Releases per year: " + getPeriodicalPublications() + "." + "\n";
        returnString += "Category: " + getCategory() + "." + "\n" + "\n";
        
        return returnString;
    }
}
