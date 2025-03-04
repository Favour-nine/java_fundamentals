package dome;

/**
 * Write a description of class TestPrint here.
 * 
 */
public class TestPrint
{
    public static void main(String[] args)
    { 
        Item p = new Item("AAA", 20);
        DVD v = new DVD("Matilda","Disney",94);
        CD c = new CD("Metallica", "Metallica",9,75); 

        p.setComment("Not Sure");
        v.setComment("Wicked");
        c.setComment("Loud");

        System.out.println("***print DVD***");
        v.print();
        System.out.println("***print CD***");
        c.print(); 
        System.out.println("***print Item***");
        p.print();

    }
}
