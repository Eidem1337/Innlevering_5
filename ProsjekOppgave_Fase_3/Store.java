import java.util.ArrayList;
/**
 * The class Store creates the Store, and holds all the functionality accessing the 
 * class LiteraturRegister. Here you can add Books to the register created in the Store, remove 
 * books either by Author name or Book Name. The class also printsout a list of the books added 
 * to the store with all information. You can also remove books from the litReg.
 * 
 * @author Vegard Eidem og Kristian Kvam 
 * @version 04.03-2016
 */
public class Store
{
    LiteratureRegister register;
    
    /**
     * Construnctor for the Store class
     */
    public Store()
    {
        register = new LiteratureRegister();
    }

    /**
     * Adds a book to the register, with title, author and release year.
     *
     * @param title title of the book
     * @param author of the book
     * @param release year of the book
     */
    public void addBook(String title, String publisher, String author, int releases)
    {
        register.addLiterature(new Book(title, publisher, author, releases));
    }

        /**
     * Adds a NewsPaper to the register, with title and publisher.
     *
     * @param title title of theNewsPaper
     * @param publisher of the NewsPaper
     * @param genre of the newspaper
     * @param category of the newspaper
     * @param releasesPerYear of the newspaper
     
     */
    public void addNewsPaper(String title, String publisher, int releasesPerYear, String genre, String category)
    {
        register.addLiterature(new NewsPaper(title, publisher, releasesPerYear, genre, category));
    }
    
        /**
     * Adds a BookSeries to the register, with title and publisher
     *
     * @param title title of the bookseries
     * @param publisher of the bookseries
     * 
     */
    public void addBookSeries(String title, String publisher, String author, int releases, int releaseDate)
    {
        register.addLiterature(new BookSeries(title, publisher, author, releases, releaseDate));
    }
    
            /**
     * Adds a Periodical to the register, with title and publisher
     *
     * @param title title of the Periodical
     * @param publisher of the Periodical
     * 
     */
    public void addPeriodical(String title, String publisher, String genre, String category, int releasesPerYear)
    {
        register.addLiterature(new Periodical(title, publisher, genre, category, releasesPerYear));
    }
    
            /**
     * Adds a Magazine to the register, with title and publisher
     *
     * @param title title of the Magazine
     * @param publisher of the Magazine
     *
     */
    public void addMagazine(String title, String publisher, String genre, String category, int releasesPerYear)
    {
        register.addLiterature(new Magazine(title, publisher, genre, category, releasesPerYear));
    }
    
    
    /**
     * Removes a given literature from the reginster. given by a String input parameter. 
     *
     * @param  String input. String of literature name.
     */
    public void removeLiterature(String input)
    {
        register.removeLiterature(input);
    }

        /**
     * Prints the information of all the literatures in the register in a list.
     */
    public String displayAllLiteratures()
    {
//        ArrayList<String> allLiterature = register.getInfoListAllLiterature();
//        String returnString = "";
//        for(String info : allLiterature){
//        returnString += info + "\n.";
//        }
        String returnString = register.getLiteratureInfoString() + "\n";
        return returnString;
    }


    /**
     * Finds a literature given by the input parameter, works with book and author name.
     *
     * @param  String input. author name or book name
     */
    public String findLiterature(String input)
    {
        return register.findLiteratureString(input);
    }

}