package artist;

import java.util.ArrayList;
import playlist.Song;

public class TomPettyAndTheHeartbreakers {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public TomPettyAndTheHeartbreakers() {
    }
    
    public ArrayList<Song> getTomPettyAndTheHeartbreakersSongs() {
    	 albumTracks = new ArrayList<Song>();                                   
    	 Song track1 = new Song("Free Fallin'", "Tom Petty and the Heart Breakers");             
         Song track2 = new Song("I Won't Back Down", "Tom Petty and the Heart Breakers");         
         Song track3 = new Song("Break Down", "Tom Petty and the Heart Breakers");	
         this.albumTracks.add(track1);                                          
         this.albumTracks.add(track2);                                          
         this.albumTracks.add(track3);											
         return albumTracks;                                                    
    }
}
