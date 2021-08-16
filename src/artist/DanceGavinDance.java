package artist;

import playlist.Song;
import java.util.ArrayList;

public class DanceGavinDance {
		
		ArrayList<Song> albumTracks;
	    String albumTitle;
	    
	    public DanceGavinDance() {
	    }
	    
	    public ArrayList<Song> getDanceGavinDanceSongs() {
	    	
	    	 albumTracks = new ArrayList<Song>();                                   
	    	 Song track1 = new Song("Care", "Dance Gavin Dance");             		
	         Song track2 = new Song("Inspire The Liars", "Dance Gavin Dance");      
	         Song track3 = new Song("Young Robot", "Dance Gavin Dance");			
	         this.albumTracks.add(track1);                                          
	         this.albumTracks.add(track2);                                          
	         this.albumTracks.add(track3);											
	         return albumTracks;                                                    
	    }
}
