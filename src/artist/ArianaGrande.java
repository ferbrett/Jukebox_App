package artist;

import playlist.Song;
import java.util.ArrayList;

public class ArianaGrande {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public ArianaGrande() {
    }
    
    public ArrayList<Song> getArianaGrandeSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                 
    	 Song track1 = new Song("Greedy", "Ariana Grande");             		
         Song track2 = new Song("NASA", "Ariana Grande");        				
         this.albumTracks.add(track1);                                          
         this.albumTracks.add(track2);                                         
         return albumTracks;                                                    
    }
}
