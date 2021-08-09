package artist;

import playlist.Song;
import java.util.ArrayList;

public class ArianaGrande {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public ArianaGrande() {
    }
    
    public ArrayList<Song> getArianaGrandeSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Greedy", "Ariana Grande");             		//Create a song
         Song track2 = new Song("NASA", "Ariana Grande");        				 //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Ariana Grande
         this.albumTracks.add(track2);                                          //Add the second song to song list for Ariana Grande
         return albumTracks;                                                    //Return the songs for ArianaGrande in the form of an ArrayList
    }
}
