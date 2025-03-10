package fr.ensai.library;

public class Magazine extends Item{

    // Attributs spécifique à Mangazine
    String issn ;
    String issueNumber ;


    // Constructor
    /**
     * @param title
     * @param year
     * @param pageCount
     * @param issn
     * @param issueNumber
     */
    public Magazine(String title, int year, int pageCount, String issn, String issueNumber){
        super(title, year, pageCount);
        this.issn = issn;
        this.issueNumber = issueNumber;

    }

    @Override
    public String toString() {
        return "Mangazine " + title + " written in " + year;
    }

    
}
