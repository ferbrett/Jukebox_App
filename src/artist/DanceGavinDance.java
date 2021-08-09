package artist;

import playlist.Song;
import java.util.ArrayList;

public class DanceGavinDance {
		
		ArrayList<Song> albumTracks;
	    String albumTitle;
	    
	    public DanceGavinDance() {
	    }
	    
	    public ArrayList<Song> getDanceGavinDanceSongs() {
	    	
	    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
	    	 Song track1 = new Song("Care", "Dance Gavin Dance");             		//Create a song
	         Song track2 = new Song("Inspire The Liars", "Dance Gavin Dance");      //Create another song
	         Song track3 = new Song("Young Robot", "Dance Gavin Dance");			//Create a third song
	         this.albumTracks.add(track1);                                          //Add the first song to song list for Dance Gavin Dance
	         this.albumTracks.add(track2);                                          //Add the second song to song list for Dance Gavin Dance 
	         this.albumTracks.add(track3);											//Add the third song to song list for Dance Gavin Dance
	         return albumTracks;                                                    //Return the songs for DanceGavinDance in the form of an ArrayList
	    }
}
