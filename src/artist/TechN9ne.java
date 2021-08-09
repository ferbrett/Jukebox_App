package artist;

import playlist.Song;
import java.util.ArrayList;

public class TechN9ne {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public TechN9ne() {
    }
    
    public ArrayList<Song> getTechN9nesSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Worldwide Choppers", "Tech N9ne");     		//Create a song
         Song track2 = new Song("This Is Me", "Tech N9ne");         			//Create another song
         Song track3 = new Song("He's a Mental Giant", "Tech N9ne");			//Create another song
         Song track4 = new Song("Dr. Sebagh", "Tech N9ne");						//Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Tech N9ne
         this.albumTracks.add(track2);                                          //Add the second song to song list for Tech N9ne 
         this.albumTracks.add(track3);											//Add the third song to song list for Tech N9ne 
         this.albumTracks.add(track4);											//Add the fourth song to song list for Tech N9ne
         return albumTracks;                                                    //Return the songs for Tech N9ne in the form of an ArrayList
    }
}
