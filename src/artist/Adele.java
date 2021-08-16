package artist;

import playlist.Song;
import java.util.ArrayList;

public class Adele {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Adele() {
    }
    
    public ArrayList<Song> getAdelesSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                          
    	 Song track1 = new Song("Hello", "Adele");         				
         Song track2 = new Song("Rolling in the Deep", "Adele");        
         Song track3 = new Song("Set Fire to the Rain", "Adele");       
         this.albumTracks.add(track1);                                  
         this.albumTracks.add(track2);                                 
         this.albumTracks.add(track3);                                  
         return albumTracks;                                            
    }
}
