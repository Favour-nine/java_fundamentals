package dome;

public class Item {
    private String title;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    public Item(String theTitle, int time){
        title = theTitle;
        playingTime = time;
        gotIt = false;
        comment = "<no comment>";
    }
    public void setComment(String comment){
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setOwn(boolean ownIt)
    {
        gotIt = ownIt;
    }

    public boolean getOwn()
    {
        return gotIt;
    }

    public String getTitle()
    {
        return title;
    }

    public void print(){
        System.out.println(title);
        System.out.println(playingTime);
        System.out.println(gotIt);
        System.out.println(comment);
    }
}
