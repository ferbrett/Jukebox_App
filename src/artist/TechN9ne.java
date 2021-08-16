package artist;

import playlist.Song;
import java.util.ArrayList;

public class TechN9ne {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public TechN9ne() {
    }
    
    public ArrayList<Song> getTechN9nesSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   
    	 Song track1 = new Song("Worldwide Choppers", "Tech N9ne");     		
         Song track2 = new Song("This Is Me", "Tech N9ne");         			
         Song track3 = new Song("He's a Mental Giant", "Tech N9ne");			
         Song track4 = new Song("Dr. Sebagh", "Tech N9ne");						
         this.albumTracks.add(track1);                                     
         this.albumTracks.add(track2);                                           
         this.albumTracks.add(track3);											
         this.albumTracks.add(track4);						
         return albumTracks;                                                    
    }
}
