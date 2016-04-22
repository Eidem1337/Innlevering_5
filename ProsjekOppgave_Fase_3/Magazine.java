
/**
 * The magazine class represents a given magazine with all information. It cotains a tilte, publisher,
 * genre and the number of annual publications. The class has a method for returning a single string 
 * with all the information.
 * 
 * @author vegard eidem 
 * @version 08.04-16
 */
public class Magazine extends Literature
{
    // instance variables - replace the example below with your own
    private String genre;
    private int releasesPerYear;
    private String category;
    /**
     * Constructor for objects of class Magazine
     */
    public Magazine(String title, String publisher, String genre, String category, int releasesPerYear)
    {
        super(title, publisher);
        this.genre = genre; 
        this.releasesPerYear = releasesPerYear;
        this.category = category;
        
    }

    /**
     * Get method for the genre variable
     * E.i. sport, cars or tech
     * @return genre    returns a string of genre of the Magazine
     *
     */
    public String getMagazineGenre(){
        return genre;
    }
    
    /**
     * Get method for the number of annual publications
     * 
     * @return annualPublications
     */
    public int getMagazinePublications(){
        return releasesPerYear;
    }
    
    public String getCategory(){
        return category;
    }
    
    /**
     * Get method for the information about Magazine.
     * 
     * @return returnString     Returns a strin of information about the Magazine
     */
    public String getInfo(){
        String returnString = "";
        
        //returnString += getLiteratureInfo();
        returnString += "Genre: " + getMagazineGenre() + "." + "\n";
        returnString += "Releases per year: " + getMagazinePublications() + "." + "\n";
        returnString += "Category: " + getCategory() + "." + "\n" + "\n";
        
        return returnString;
    }
}
