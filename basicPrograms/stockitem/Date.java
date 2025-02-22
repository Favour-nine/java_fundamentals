package basicPrograms.stockitem;

public class Date {
   /** Fields of a Date - just the day, month and year*/
    private int day;
    private int month;
    private int year;


    /**
     * Constructor for objects of class Date
     * @param d - the day part of the date (1 - 31, depending on the month).
     * @param m - the month part of the date (1 - 12).
     * @param y - the year part of the date.
     */
    public Date(int d, int m, int y)
    {
        day = d;
        month = m;
        year = y;
    }


    /** reset the date - no checking
     */
    public void setDate(int dd, int mm, int yy)
    {
        day = dd;
        month = mm;
        year = yy;
    }


    /** return the month number
     */
    public int getMonth()
    {
        return month;
    }


    /**
     * @return the date as a String, format "09/11/2002"
     */
    public String getAsString ()
    {
        return as2Digits(day) + "/" + as2Digits(month) + "/" + year;
    }


    /** Internal method to add a leading zero if necessary. */
    private String as2Digits (int i)
    {
        if (i <10)
        {
            return "0" + i;
        }
        else
        {
            return "" + i;
        }
    }

}
