package ood;


/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog
{
    private String name;
    private String breed;
    private int legs;
    private int age;
    private Date dob;

    public Dog(String nm, String br)
    {
        name = nm;
        breed = br;
        legs = 4;
        dob = new Date(1,1,2000);
    }

    public void setAge(int aaa)
    {
        age = aaa;
    }


    public void setDob(int d, int m, int y)
    {
        dob = new Date(d,m,y);
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public Date getDob()
    {
        return dob;
    }

    public String getAsString()
    {
        return "Dog Name: " + name + "\nBreed: " + breed + "\nAge: "
                + age + "\nDOB:  " + dob.getAsString() + "\n";
    }


}
