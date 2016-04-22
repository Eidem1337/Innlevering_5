

/**
 * Links the classes to gather
 * 
 * @author asty
 */
public class Application {
    private Store store;
    
    public Application(){
    store = new Store();
    
    }

    public void init() {
       System.out.println("init() was called");
     }

    public void doListAllProducts() {
        
        System.out.println(store.displayAllLiteratures() + "\n");
    }
    
    public void doRegisterBook() {
        
        InputReader reader = new InputReader();
        String title = reader.getInputString();
        String publisher = reader.getInputString();
        String author = reader.getInputString();
        int releases = reader.getInputInt();
        store.addBook(title, publisher, author, releases);
    }
    
    public void doRegisterBookSeries(){
        
        InputReader reader = new InputReader();
        String title = reader.getInputString();
        String publisher = reader.getInputString();
        String author = reader.getInputString();
        int releases = reader.getInputInt();
        int releaseDate = reader.getInputInt();
        store.addBookSeries(title, publisher, author, releases, releaseDate);
    }
    
    public void doRegisterNewspaper(){
        
        InputReader reader = new InputReader();
        String title = reader.getInputString();
        String publisher = reader.getInputString();
        String genre = reader.getInputString();
        String category = reader.getInputString();
        int releasesPerYear = reader.getInputInt();
        store.addNewsPaper(title, publisher, releasesPerYear, genre, category);
    }
    
    public void doRegisterMagazine(){
        
        InputReader reader = new InputReader();
        String title = reader.getInputString();
        String publisher = reader.getInputString();
        String genre = reader.getInputString();
        String category = reader.getInputString();
        int releasesPerYear = reader.getInputInt();
        store.addMagazine(title, publisher, genre, category, releasesPerYear);
    }
    
    public void doRegisterPeriodical(){
        
        InputReader reader = new InputReader();
        String title = reader.getInputString();
        String publisher = reader.getInputString();
        String genre = reader.getInputString();
        String category = reader.getInputString();
        int releasesPerYear = reader.getInputInt();
        store.addPeriodical(title, publisher, genre, category, releasesPerYear);
    }

    public void doFindProductByDescription() {
       InputReader reader = new InputReader();
       String title = reader.getInputString();
       System.out.println(store.findLiterature(title));
    }

    public void doRegisterSale() {
        System.out.println("doRegisterSale() was called");
    }
   
}
