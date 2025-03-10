package fr.ensai.library;

public abstract class Item {
    // Attributs
    protected String title ;
    protected int year ;
    protected int pageCount ;

    // Constructors
    /**
     * @param title
     */
    public Item(String title, int year, int pageCount){
        this.title = title;
        this.year = year ;
        this.pageCount = pageCount;       
    }
    
}
