package artist;

import playlist.Song;
import java.util.ArrayList;

public class TheBeatles {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public TheBeatles() {
    }
    
    public ArrayList<Song> getBeatlesSongs() {
    	 albumTracks = new ArrayList<Song>();                                   
    	 Song track1 = new Song("Yellow Submarine", "The Beatles");             
         Song track2 = new Song("All You Need Is Love", "The Beatles");         
         Song track3 = new Song("Strawberry Fields Forever", "The Beatles");	
         this.albumTracks.add(track1);                                          
         this.albumTracks.add(track2);                                          
         this.albumTracks.add(track3);											
         return albumTracks;                                                    
    }
}
