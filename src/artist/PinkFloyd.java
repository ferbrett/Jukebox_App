package artist;

import playlist.Song;
import java.util.ArrayList;

public class PinkFloyd {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public PinkFloyd() {
    }
    
    public ArrayList<Song> getPinkFloydsSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Another Brick in the Wall", "Pink Floyd");     //Create a song
         Song track2 = new Song("Comfortably Numb", "Pink Floyd");         		//Create another song
         Song track3 = new Song("Money", "Pink Floyd");							//Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Pink Floyd
         this.albumTracks.add(track2);                                          //Add the second song to song list for Pink Floyd 
         this.albumTracks.add(track3);											//Add the third song to song list for Pink Floyd 
         return albumTracks;                                                    //Return the songs for Pink Floyd in the form of an ArrayList
    }
}
