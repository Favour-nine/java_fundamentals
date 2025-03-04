package dome;
/* which statements will compile ?
*/

public class Tester2
{    
    public static void main(String[] args)
    { 
        Item p = new Item("AAA", 20);
        DVD v = new DVD("Matilda","Disney",94);
        CD c = new CD("Metallica", "Metallica",9,75); 
        
        String s;     
        // Which of these would cause compilation errors ?
        s = v.getDirector();

//        s =  c.getArtist();

//        s = p.getComment();
        
//        s = v.getTitle();
//        s = c.getTitle();
//        s = p.getTitle();

        System.out.println(s);
    }
}