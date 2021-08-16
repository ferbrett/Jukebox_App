package artist;

import playlist.Song;
import java.util.ArrayList;

public class PinkFloyd {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public PinkFloyd() {
    }
    
    public ArrayList<Song> getPinkFloydsSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   
    	 Song track1 = new Song("Another Brick in the Wall", "Pink Floyd");     
         Song track2 = new Song("Comfortably Numb", "Pink Floyd");         		
         Song track3 = new Song("Money", "Pink Floyd");							
         this.albumTracks.add(track1);                                          
         this.albumTracks.add(track2);                                          
         this.albumTracks.add(track3);										
         return albumTracks;                                                    
    }
}
