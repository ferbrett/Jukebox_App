package artist;

import java.util.ArrayList;
import playlist.Song;

public class TobyKieth {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public TobyKieth() {
    }
    
    public ArrayList<Song> getTobyKiethSongs() {
    	 albumTracks = new ArrayList<Song>();                                   
    	 Song track1 = new Song("Made in America", "Toby Kieth");             
         Song track2 = new Song("Shold've Been a Cowboy", "Toby Kieth");         
         Song track3 = new Song("As Good As I One Was", "Toby Kieth");	
         this.albumTracks.add(track1);                                          
         this.albumTracks.add(track2);                                          
         this.albumTracks.add(track3);											
         return albumTracks;                                                    
    }
}
