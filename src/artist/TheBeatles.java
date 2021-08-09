package artist;

import playlist.Song;
import java.util.ArrayList;

public class TheBeatles {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public TheBeatles() {
    }
    
    public ArrayList<Song> getBeatlesSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Yellow Submarine", "The Beatles");             //Create a song
         Song track2 = new Song("All You Need Is Love", "The Beatles");         //Create another song
         Song track3 = new Song("Strawberry Fields Forever", "The Beatles");	//Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for The Beatles
         this.albumTracks.add(track2);                                          //Add the second song to song list for The Beatles 
         this.albumTracks.add(track3);											//Add the third song to the song list for The Beatles
         return albumTracks;                                                    //Return the songs for The Beatles in the form of an ArrayList
    }
}
