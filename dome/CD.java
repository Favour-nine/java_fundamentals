package dome;

public class CD extends Item{

    private String artist;
    private int numberOfTracks;

    /**
     * Initialize the CD.
     * @param theTitle The title of the CD.
     * @param theArtist The artist of the CD.
     * @param tracks The number of tracks on the CD.
     * @param time The playing time of the CD.
     */
    public CD(String theTitle, String theArtist, int tracks, int time)
    {
        super(theTitle, time);
        artist = theArtist;
        numberOfTracks = tracks;
    }


    /**
     * @return the artist
     */
    public String getArtist()
    {
        return artist;
    }

    /**
     * sets a new artist
     * @dir the new artist
     */
    public void setArtist(String dir)
    {
        artist = dir;
    }

    /**
     * @return the number of tracks
     */
    public int getTracks()
    {
        return numberOfTracks;
    }

    /**
     * sets number of tracks
     * @trks number of tracks
     */
    public void setTracks(int trks)
    {
        numberOfTracks = trks;
    }


    /**
     * Print details about this CD to the text terminal.
     */
    public void print()
    {
        super.print();
        System.out.println("    " + artist);
        System.out.println("    tracks: " + numberOfTracks);
    }


}
