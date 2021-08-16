package artist;

import playlist.Song;
import java.util.ArrayList;

public class ImagineDragons {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public ImagineDragons() {
    }
    
    public ArrayList<Song> getImagineDragonsSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                       
    	 Song track1 = new Song("Believer", "Imagine Dragons");        
         Song track2 = new Song("Radioactive", "Imagine Dragons");      
         Song track3 = new Song("Demons", "Imagine Dragons");          
         this.albumTracks.add(track1);                                 
         this.albumTracks.add(track2);                                   
         this.albumTracks.add(track3);                                  
         return albumTracks;                                            
    }
}
