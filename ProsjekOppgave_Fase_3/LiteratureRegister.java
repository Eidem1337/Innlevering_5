import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;

/** 
 * The LiteraturRegister's job is to hold on the information about the different literatures
 * addet to it, different print strings assosiated to the literatures and methods for sarching/matching literatures to the register. 
 * Finds the different functionalties as strings, such as f.eks getInfoListAllLiterature().
 * The class can also check for matching literatures given by an input parameter. You can also find information
 * about the literatureby different methods.
 * The class also holds a method for adding dummy literatures for test purposes.
 *                                  
 * @author Vegard Eidem og Kristian Kvam 
 * @version 04.03-2016
 */

public class LiteratureRegister
{
    
    
    private ArrayList<Literature> literatureList; 
  
    /**
     * Constructor for objects of class LiteratureRegister
     */
    public LiteratureRegister()
    {
        literatureList = new ArrayList<Literature>();
       
        
    }

    /**
     * 
     */
    public void addLiterature(Literature newLiterature)
    {
        //Literature newLiterature = new Literature(title, publisher);
        literatureList.add(newLiterature);
    }

    public Literature getLiteratureTitle(String input)
    {
        boolean found = false;
        int index = 0;
        Literature selectedLiterature = null;
        while (!found && index < literatureList.size()){
            if(literatureList.get(index).getTitle().toLowerCase().equals(input.trim().toLowerCase()))
            {
                found = true;
                selectedLiterature = literatureList.get(index);
            }
            else{
                index++;
            }
        }
        return selectedLiterature;
    }

    /**
     * Return a string with the information about the literature
     */
    public ArrayList<Literature> searchingForLiterature(String input) 
    {
        ArrayList<Literature> matchingLiterature = new ArrayList<Literature>();
        for(Literature selectedLiterature : literatureList){
            if(selectedLiterature.getTitle().toLowerCase().contains(input)){
                matchingLiterature.add(selectedLiterature);
            }
            else if(selectedLiterature.getPublisher().toLowerCase().contains(input)){
                matchingLiterature.add(selectedLiterature);
            }
        }
        return matchingLiterature;    
    }

    /**
     * A search function for the literature. Searches for the title of the literature, checks
     * if the literature is in the litReg.
     *
     * @param  String title
     */

    public ArrayList<String> findLiteratureList(String input)
    {
        ArrayList<String> matchingLiteratureList = new ArrayList<>();
        for(Literature selectedLiterature : literatureList){
            if(selectedLiterature.getTitle().contains(input)){
                matchingLiteratureList.add(selectedLiterature.getLiteratureInfo());
            }
            else if(selectedLiterature.getPublisher().contains(input)){
                matchingLiteratureList.add(selectedLiterature.getLiteratureInfo());
            }
            else if(selectedLiterature.getTitle().toLowerCase().contains(input)){
                matchingLiteratureList.add(selectedLiterature.getLiteratureInfo());
            }
            else if(selectedLiterature.getPublisher().toLowerCase().contains(input)){
                matchingLiteratureList.add(selectedLiterature.getLiteratureInfo());
            }
        }
        return matchingLiteratureList;
    }

    /**
     * Adding a literature to the litReg ArrayList. If the literature already exist in the
     * register a message about that is printed to the Terminal window.
     *
     * @param  Literature id
     * @return  id
     */
    public String findLiteratureString(String input)
    {
        String returnString = "";
        for(Literature selectedLiterature :  literatureList){
        if(selectedLiterature.getTitle().contains(input)){
            returnString += selectedLiterature.getLiteratureInfo() + "\n";
        }
        else if(selectedLiterature.getPublisher().contains(input)){
            returnString += selectedLiterature.getLiteratureInfo() + "\n";
        }    
        else if(selectedLiterature.getTitle().toLowerCase().contains(input)){
            returnString += selectedLiterature.getLiteratureInfo() + "\n";
        }
        else if(selectedLiterature.getPublisher().toLowerCase().contains(input)){
            returnString += selectedLiterature.getLiteratureInfo() + "\n";
        }
        }
        return returnString;     
    }
    
    /**
     * Returns a list with all information about every literature in the register.
     * @return returns an ArrayList<String>, every index holds info about one literature-
     * example: Title: Publisher: Release year: .
     */
    public ArrayList<String> getInfoListAllLiterature()
    {
        ArrayList<String> allLiterature = new ArrayList<>();
        for(Literature selectedLiterature : literatureList){
        allLiterature.add("Title: " +selectedLiterature.getTitle() + ". by: " + selectedLiterature.getPublisher()+ ".");
        }
        return allLiterature;
    }

    /**
     * Returns an ArrayList with info on each literature in the list given as a parameter
     * 
     * @return returns an ArrayList<String> with info about each literature in the input parameter list.
     * An index holds the info for one literature. Example: Title: by: Release year: .
     */
    public ArrayList<String> getInfoListForEachLiterature()
    {
        ArrayList<String> infoListLiterature = new ArrayList<String>();
        for(Literature selectedLiterature : literatureList){
        infoListLiterature.add("Title: " + selectedLiterature.getTitle() + ". by: " +selectedLiterature.getPublisher() +".");
        }
        return infoListLiterature;
    }
    
    /**
     * Prints information about one given literature, given by the parameter inputLiterature.
     *
     * @param  Literature inputLiterature List 
     * @return literature
     */
    public String getLiteratureInfo(Literature inputLiterature)
    {
        String literature = null;
        if(inputLiterature != null){
        literature = ("Title: " + inputLiterature.getTitle() + ". by: " + inputLiterature.getPublisher() + ".");
        }
        return literature;
    }

    /**
     * Returns a infoString that gives all the information by all the literatures
     *
     * @return infoString
     */
    public String getLiteratureInfoString()
    {
        String infoString = "";
        for(Literature selectedLiterature : literatureList){
        infoString += ("Title: " + selectedLiterature.getTitle() + "." + "\n" + "Publisher: " + selectedLiterature.getPublisher()+ "." + "\n");
         
        if(selectedLiterature instanceof Book){
                infoString += ((Book) selectedLiterature).getInfo();
            }
            else if(selectedLiterature instanceof BookSeries){
                infoString += ((BookSeries) selectedLiterature).getInfo();
            }
            else if(selectedLiterature instanceof Magazine){
                infoString += ((Magazine) selectedLiterature).getInfo();
            }
            else if(selectedLiterature instanceof NewsPaper){
                infoString += ((NewsPaper) selectedLiterature).getInfo();
            }
            else if(selectedLiterature instanceof Periodical){
                infoString += ((Periodical) selectedLiterature).getInfo();
                 
        }
        }
        return infoString;
    }
  

    /**
     * Removes literature from literatureList
     * @param indexToRemove
     */
    public void removeLiterature(int indexToRemove)
    {
        literatureList.remove(indexToRemove);
    }

     public void removeLiterature(String input){
        boolean found = false;
        int index = 0;
        while(!found && index < literatureList.size()){
            if(literatureList.get(index).getTitle().toLowerCase().equals(input.trim().toLowerCase())){
                found = true;
                literatureList.remove(index);

            }
            else{
                index++;
            }
        }
    }
    


    /**
     * Clears the Terminal Window.
     */
     public void clear(){
        for(int i = 0; i<60; i++){
            System.out.println("");
        }
    }
}
