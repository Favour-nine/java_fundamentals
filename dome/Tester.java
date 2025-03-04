package dome;

/**
 * Write a description of class Tester here.
 * 
 */
public class Tester
{
    public static void main(String args[]){
        
        Database db = new Database();
        
        CD cd1 = new CD("Funky Music", "Joe Bloggs", 10, 80);
        CD cd2 = new CD("Boring Music", "Fred Bloggs", 10, 80);
        CD cd3 = new CD("Metallica", "Metallica", 10, 80);
        
        DVD dvd1 = new DVD("Psycho","Hitchcock",160);
        DVD dvd2 = new DVD("Bambi","Disney",100);
        DVD dvd3 = new DVD("Alien", "Universal", 150);
        
        db.addCD(cd1);
        db.addCD(cd2);
        db.addCD(cd3);
        db.addDVD(dvd1);
        db.addDVD(dvd2);
        // no dvd3 added  ?????
        
        db.list();
    }
}
