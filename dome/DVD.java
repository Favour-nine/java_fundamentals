package dome;

/**
 * The DVD class represents a DVD object. Information about the 
 * DVD is stored and can be retrieved. We assume that we only deal 
 * with movie DVDs at this stage.
 * 
 */
public class DVD extends Item
{
    private String director;


    /**
     * Constructor for objects of class DVD
     * @param theTitle The title of this DVD.
     * @param theDirector The director of this DVD.
     * @param time The running time of the main feature.
     */
    public DVD(String theTitle, String theDirector, int time)
    {
        super(theTitle, time);
        director = theDirector;
    }

    /** 
     * @return the director
     */
    public String getDirector()
    {
        return director;
    }
    
    /** 
     * sets a new director
     * @dir the new director
     */
    public void setDirector(String dir)
    {
        director = dir;
    }
    
    /**
     * Print details about this DVD to the text terminal.
     */
    public void print()
    {
        super.print();
        System.out.println("Director: " + director);
//        System.out.println("    " + comment);
    }
}
